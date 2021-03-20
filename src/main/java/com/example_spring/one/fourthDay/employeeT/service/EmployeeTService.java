package com.example_spring.one.fourthDay.employeeT.service;

import com.example_spring.one.fourthDay.employeeT.dao.EmployeeTDao;
import com.example_spring.one.fourthDay.employeeT.entity.EmployeeT;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTService {


  private final EmployeeTDao employeeTDao;

  public EmployeeTService(EmployeeTDao employeeTDao) {
    this.employeeTDao = employeeTDao;
  }


  public List< EmployeeT > findAll() {
    return employeeTDao.findAll();
  }


  public EmployeeT findById(Integer id) {
    return employeeTDao.getOne(id);
  }


  public EmployeeT persist(EmployeeT employeeT) {

    return employeeTDao.save(employeeT);
  }


  public void deleteById(Integer id) {
    employeeTDao.deleteById(id);
  }
}