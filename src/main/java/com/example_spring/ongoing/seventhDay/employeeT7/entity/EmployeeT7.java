package com.example_spring.ongoing.seventhDay.employeeT7.entity;

import com.example_spring.ongoing.seventhDay.task7.entity.Task7;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeT7 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

  @OneToMany
  private List< Task7 > task7s;

}
