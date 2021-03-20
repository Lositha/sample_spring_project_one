package com.example_spring.ongoing.sixthDay.task6.entity;


import com.example_spring.common_thing.enums.Behavior;
import com.example_spring.ongoing.sixthDay.employeeT6.entity.EmployeeT6;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task6 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Behavior behavior;

  @OneToMany(mappedBy = "task5")
  private List< EmployeeT6 > employeeT6s;

}
