package com.example_spring.one.thirdDay.controller;

import com.example_spring.one.thirdDay.entity.EmployeeOne;
import com.example_spring.one.thirdDay.service.EmployeeOneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/employeeOne" )
//Method = get =>  localhost:8080/employeeOne
//Method = post => localhost:8080/employeeOne
//Method = get => localhost:8080/employeeOne/add
//Method = get =>  localhost:8080/employeeOne/id
//Method = get =>  localhost:8080/employeeOne/edit/id
//Method = get =>  localhost:8080/employeeOne/view/id
public class EmployeeOneController {
  //CRUD -> Create Read Update Delete
  private final EmployeeOneService employeeOneService;

  public EmployeeOneController(EmployeeOneService employeeOneService) {
    this.employeeOneService = employeeOneService;
  }

  // 1. All entity values method => Read
  @GetMapping
  private String findAll(Model model) {
    model.addAttribute("employeeOnes", employeeOneService.findAll());
    return "thirdDay/employeeOne";
  }

  // 2. One entity add form method => not related crud
  @GetMapping( "/add" )
  private String addForm(Model model) {
     model.addAttribute("employeeOne",new EmployeeOne());
    return "thirdDay/addEmployeeOne";
  }

  // 3. save/update (persist) method => create and update
  @PostMapping
  public String persist(@ModelAttribute EmployeeOne employeeOne) {
    employeeOneService.persist(employeeOne);
    return "redirect:/employeeOne";
  }

  // 4. particular entity edit => read
  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("employeeOne",employeeOneService.findById(id));
    return "thirdDay/addEmployeeOne";
  }
  // 4. particular entity view => read
  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeDetail",employeeOneService.findById(id));
    return "thirdDay/employeeOne-detail";
  }
  // 5. particular entity delete => delete
  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    employeeOneService.deleteById(id);
    return "redirect:/employeeOne";
  }
}
