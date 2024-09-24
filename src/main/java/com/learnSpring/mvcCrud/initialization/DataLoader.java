//package com.learnSpring.mvcCrud.initialization;
//import com.learnSpring.mvcCrud.dao.RoleDao;
//import com.learnSpring.mvcCrud.dao.UserDao;
//import com.learnSpring.mvcCrud.entity.Role;
//import com.learnSpring.mvcCrud.entity.User;
//import jakarta.annotation.PostConstruct;
//import jakarta.transaction.Transactional;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//@Service
//@Data
//@AllArgsConstructor
//public class DataLoader {
//
//    private final RoleDao roleDao;
//    private final UserDao userDao;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @PostConstruct
//    @Transactional
//    public void init() {
//        // Save roles only if they don't exist in the database to avoid duplication
//        if (roleDao.findRoleByAuthority("ROLE_EMPLOYEE") == null) {
//            roleDao.save(new Role("ROLE_EMPLOYEE"));
//        }
//        if (roleDao.findRoleByAuthority("ROLE_MANAGER") == null) {
//            roleDao.save(new Role("ROLE_MANAGER"));
//        }
//        if (roleDao.findRoleByAuthority("ROLE_ADMIN") == null) {
//            roleDao.save(new Role("ROLE_ADMIN"));
//        }
//
//        // Fetch managed roles from database
//        Role roleEmployee = roleDao.findRoleByAuthority("ROLE_EMPLOYEE");
//        Role roleManager = roleDao.findRoleByAuthority("ROLE_MANAGER");
//        Role roleAdmin = roleDao.findRoleByAuthority("ROLE_ADMIN");
//
//        // Ensure roles are not null before creating users
//        if (roleEmployee != null && roleManager != null && roleAdmin != null) {
//            // Create users using managed Role entities
//            User john = new User("john",
//                    bCryptPasswordEncoder.encode("password"),
//                    true,
//                    new HashSet<>(Arrays.asList(roleEmployee)));
//
//            User mary = new User("mary",
//                    bCryptPasswordEncoder.encode("password"),
//                    true,
//                    new HashSet<>(Arrays.asList(roleEmployee, roleManager)));
//
//            User susan = new User("susan",
//                    bCryptPasswordEncoder.encode("password"),
//                    true,
//                    new HashSet<>(Arrays.asList(roleEmployee, roleManager, roleAdmin)));
//
//            // Save users
//            userDao.save(john);
//            userDao.save(mary);
//            userDao.save(susan);
//
//            System.out.println("Users and roles inserted successfully.");
//        } else {
//            System.err.println("Roles could not be fetched correctly.");
//        }
//    }
//}