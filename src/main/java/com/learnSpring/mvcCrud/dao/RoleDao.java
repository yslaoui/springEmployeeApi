package com.learnSpring.mvcCrud.dao;

import com.learnSpring.mvcCrud.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
    public Role findRoleByAuthority(String authority);
}
