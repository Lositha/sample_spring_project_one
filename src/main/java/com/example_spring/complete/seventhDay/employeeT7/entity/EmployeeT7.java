package com.example_spring.complete.seventhDay.employeeT7.entity;

import com.example_spring.complete.seventhDay.task7.entity.Task7;
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

  @ManyToMany
  @JoinTable( name = "employeet7_task7",
      joinColumns = @JoinColumn( name = "employeet7_id" ),
      inverseJoinColumns = @JoinColumn( name = "task7s_id" ) )
  private List< Task7 > task7s;

}
