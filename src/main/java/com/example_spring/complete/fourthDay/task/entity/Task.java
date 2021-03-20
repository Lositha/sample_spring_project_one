package com.example_spring.complete.fourthDay.task.entity;


import com.example_spring.common_thing.enums.Behavior;
import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Behavior behavior;

}
