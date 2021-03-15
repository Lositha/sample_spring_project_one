package com.example_spring.one.thirdDay.dao;

import com.example_spring.one.thirdDay.entity.EmployeeOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeOneDao extends JpaRepository< EmployeeOne, Integer> {


}
