package com.example_spring.complete.fourthDay.employeeT.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeT {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

}
