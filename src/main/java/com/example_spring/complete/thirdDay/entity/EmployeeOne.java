package com.example_spring.complete.thirdDay.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeOne {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

}
