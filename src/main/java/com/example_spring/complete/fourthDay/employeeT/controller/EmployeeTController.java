package com.example_spring.complete.fourthDay.employeeT.controller;

import com.example_spring.complete.fourthDay.employeeT.entity.EmployeeT;
import com.example_spring.complete.fourthDay.employeeT.service.EmployeeTService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/employeeT" )
public class EmployeeTController {

  private final EmployeeTService employeeTService;

  public EmployeeTController(EmployeeTService employeeTService) {
    this.employeeTService = employeeTService;
  }


  @GetMapping
  private String findAll(Model model) {

    model.addAttribute("employeeOnes", employeeTService.findAll());

    return "fourthDay/employeeT/employeeT";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
     model.addAttribute("employeeT",new EmployeeT());
    return "fourthDay/employeeT/addEmployeeT";
  }


  @PostMapping
  public String persist(@ModelAttribute EmployeeT employeeT) {
    employeeTService.persist(employeeT);
    return "redirect:/employeeT";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("employeeOne", employeeTService.findById(id));
    return "fourthDay/employeeT/addEmployeeT";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeDetail", employeeTService.findById(id));
    return "fourthDay/employeeT/employeeT-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    employeeTService.deleteById(id);
    return "redirect:/employeeT";
  }
}

