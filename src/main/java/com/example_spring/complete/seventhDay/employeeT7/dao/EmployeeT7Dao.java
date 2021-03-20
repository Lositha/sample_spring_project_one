package com.example_spring.complete.seventhDay.employeeT7.dao;

import com.example_spring.complete.seventhDay.employeeT7.entity.EmployeeT7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeT7Dao extends JpaRepository< EmployeeT7, Integer> {


}
