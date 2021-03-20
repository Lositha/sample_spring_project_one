package com.example_spring.complete.fourthDay.task.service;

import com.example_spring.complete.fourthDay.task.dao.TaskDao;
import com.example_spring.complete.fourthDay.task.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


  private final TaskDao taskDao;

  public TaskService(TaskDao taskDao) {
    this.taskDao = taskDao;
  }


  public List< Task > findAll() {
    return taskDao.findAll();
  }


  public Task findById(Integer id) {
    return taskDao.getOne(id);
  }


  public Task persist(Task task) {

    return taskDao.save(task);
  }


  public void deleteById(Integer id) {
    taskDao.deleteById(id);
  }
}
