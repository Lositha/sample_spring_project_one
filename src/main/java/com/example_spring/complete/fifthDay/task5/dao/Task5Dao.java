package com.example_spring.complete.fifthDay.task5.dao;


import com.example_spring.complete.fifthDay.task5.entity.Task5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task5Dao extends JpaRepository< Task5, Integer> {


}
