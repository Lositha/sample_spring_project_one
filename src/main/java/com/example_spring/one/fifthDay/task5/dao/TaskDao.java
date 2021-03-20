package com.example_spring.one.fifthDay.task5.dao;


import com.example_spring.one.fifthDay.task5.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository< Task, Integer> {


}
