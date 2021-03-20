package com.example_spring.ongoing.fifthDay.employeeT5.controller;

import com.example_spring.ongoing.fifthDay.employeeT5.entity.EmployeeT5;
import com.example_spring.ongoing.fifthDay.employeeT5.service.EmployeeT5Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/employeeT5" )
public class EmployeeT5Controller {

  private final EmployeeT5Service employeeT5Service;

  public EmployeeT5Controller(EmployeeT5Service employeeT5Service) {
    this.employeeT5Service = employeeT5Service;
  }


  @GetMapping
  private String findAll(Model model) {

    model.addAttribute("employeeOnes", employeeT5Service.findAll());

    return "fifthDay/employeeT5/employeeT5";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
     model.addAttribute("employeeT5",new EmployeeT5());
    return "fifthDay/employeeT5/addEmployeeT5";
  }


  @PostMapping
  public String persist(@ModelAttribute EmployeeT5 employeeT5) {
    employeeT5Service.persist(employeeT5);
    return "redirect:/employeeT5";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("employeeOne", employeeT5Service.findById(id));
    return "fifthDay/employeeT5/addEmployeeT5";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeDetail", employeeT5Service.findById(id));
    return "fifthDay/employeeT5/employeeT5-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    employeeT5Service.deleteById(id);
    return "redirect:/employeeT5";
  }
}

