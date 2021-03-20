package com.example_spring.complete.fourthDay.task.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Behavior {
  OPTIONAL(" Optional "),
  COMPULSORY(" Compulsory");

  private final String behavior;
}
