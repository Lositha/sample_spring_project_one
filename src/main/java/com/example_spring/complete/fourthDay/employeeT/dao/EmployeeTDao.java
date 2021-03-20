package com.example_spring.complete.fourthDay.employeeT.dao;

import com.example_spring.complete.fourthDay.employeeT.entity.EmployeeT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTDao extends JpaRepository< EmployeeT, Integer> {


}
