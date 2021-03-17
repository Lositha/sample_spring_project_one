package com.example_spring.one.fourthDay.EmployeeT.dao;

import com.example_spring.one.fourthDay.EmployeeT.entity.EmployeeT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTDao extends JpaRepository< EmployeeT, Integer> {


}
