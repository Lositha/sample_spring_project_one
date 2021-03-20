package com.example_spring.complete.thirdDay.dao;

import com.example_spring.complete.thirdDay.entity.EmployeeOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeOneDao extends JpaRepository< EmployeeOne, Integer> {

}
