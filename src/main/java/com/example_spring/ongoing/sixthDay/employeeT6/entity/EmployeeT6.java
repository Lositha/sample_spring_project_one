package com.example_spring.ongoing.sixthDay.employeeT6.entity;

import com.example_spring.ongoing.sixthDay.task6.entity.Task6;
import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeT6 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

  @ManyToOne
  private Task6 task6;


}
