package com.example_spring.one.thirdDay.service;

import com.example_spring.one.thirdDay.dao.EmployeeOneDao;
import com.example_spring.one.thirdDay.entity.EmployeeOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeOneService {

/*
  @Autowired
  private EmployeeOneDao employeeOneDao;
*/

  private final EmployeeOneDao employeeOneDao;

  public EmployeeOneService(EmployeeOneDao employeeOneDao) {
    this.employeeOneDao = employeeOneDao;
  }

  //CRUD -> Create Read Update Delete
// 1. find all -> read
  public List< EmployeeOne > findAll() {
    return employeeOneDao.findAll();
  }

  // 2. particular entity -> read
  public EmployeeOne findById(Integer id) {
    return employeeOneDao.getOne(id);
  }

  // 3. save update (persist) -> create update
  public EmployeeOne persist(EmployeeOne employeeOne) {
    return employeeOneDao.save(employeeOne);
  }

  // 4. delete -> delete
  public void deleteById(Integer id) {
    employeeOneDao.deleteById(id);
  }
}
