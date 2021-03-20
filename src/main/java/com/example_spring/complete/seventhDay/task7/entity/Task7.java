package com.example_spring.complete.seventhDay.task7.entity;




import com.example_spring.common_thing.enums.Behavior;
import com.example_spring.complete.seventhDay.employeeT7.entity.EmployeeT7;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task7 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Behavior behavior;

  @ManyToMany(mappedBy = "task7s")
  private List< EmployeeT7 > employeeT7s;

}
