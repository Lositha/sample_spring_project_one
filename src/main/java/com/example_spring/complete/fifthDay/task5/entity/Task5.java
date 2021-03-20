package com.example_spring.complete.fifthDay.task5.entity;


import com.example_spring.common_thing.enums.Behavior;
import com.example_spring.complete.fifthDay.employeeT5.entity.EmployeeT5;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task5 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Behavior behavior;

  @OneToMany(mappedBy = "task5")
  private List< EmployeeT5 > employeeT5s;

}
