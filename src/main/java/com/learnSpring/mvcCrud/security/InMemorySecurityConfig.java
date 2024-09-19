package com.learnSpring.mvcCrud.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class InMemorySecurityConfig {

      @Bean
      public UserDetailsManager userDetailsManager(DataSource datasource) {
          return new JdbcUserDetailsManager(datasource);
      }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager() {
//        UserDetails john = User.builder()
//                .username("john")
//                .password("{noop}test123")
//                .roles("EMPLOYEE")
//                .build();
//        UserDetails mary = User.builder()
//                .username("mary")
//                .password("{noop}test123")
//                .roles("EMPLOYEE", "MANAGER")
//                .build();
//        UserDetails susan = User.builder()
//                .username("susan")
//                .password("{noop}test123")
//                .roles("EMPLOYEE", "MANAGER", "ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(john, mary, susan);
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws  Exception {
        http.authorizeHttpRequests(configurer ->
                        configurer
                                .requestMatchers("/").hasRole("EMPLOYEE")
                                .requestMatchers("/employees/list/**").hasRole("MANAGER")
                                .requestMatchers("/employees/add-employees/**").hasRole("ADMIN")
                                .requestMatchers("/employees/updateEmployee/**").hasRole("MANAGER")
                                .requestMatchers("/employees/deleteEmployee/**").hasRole("ADMIN")
                                .anyRequest().authenticated())
                .formLogin(form->form.loginPage("/showMyLoginPage")
                        .loginProcessingUrl("/authenticateTheUser")
                        .permitAll()
                )
                .exceptionHandling(configurer->
                        configurer
                                .accessDeniedPage("/access-denied")
                )
                .logout(logout->logout.permitAll());
        ;
        return http.build();

    }





}
