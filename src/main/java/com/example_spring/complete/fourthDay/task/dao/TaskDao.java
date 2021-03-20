package com.example_spring.complete.fourthDay.task.dao;


import com.example_spring.complete.fourthDay.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository< Task, Integer> {


}
