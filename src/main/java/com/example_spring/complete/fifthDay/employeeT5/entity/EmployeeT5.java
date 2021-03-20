package com.example_spring.complete.fifthDay.employeeT5.entity;

import com.example_spring.complete.fifthDay.task5.entity.Task5;
import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeT5 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

  @ManyToOne
  private Task5 task5;


}
