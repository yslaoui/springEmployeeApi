package com.learnSpring.restApi.dao;


import com.learnSpring.restApi.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImplementation implements EmployeeDAO{

    EntityManager entityManager;

    @Autowired
    public EmployeeDaoImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("SELECT s FROM Employee s", Employee.class);
        return query.getResultList();
    }
}
