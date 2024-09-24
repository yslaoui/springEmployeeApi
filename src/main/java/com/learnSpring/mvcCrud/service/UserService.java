package com.learnSpring.mvcCrud.service;

import com.learnSpring.mvcCrud.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);
}
