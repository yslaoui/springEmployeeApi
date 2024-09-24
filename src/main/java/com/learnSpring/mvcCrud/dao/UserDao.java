package com.learnSpring.mvcCrud.dao;

import com.learnSpring.mvcCrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
