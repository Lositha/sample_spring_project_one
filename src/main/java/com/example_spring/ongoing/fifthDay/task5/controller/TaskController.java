package com.example_spring.ongoing.fifthDay.task5.controller;



import com.example_spring.ongoing.fifthDay.task5.entity.Task;
import com.example_spring.ongoing.fifthDay.task5.entity.enums.Behavior;
import com.example_spring.ongoing.fifthDay.task5.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/task" )
public class TaskController {

  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }


  @GetMapping
  private String findAll(Model model) {

    model.addAttribute("tasks", taskService.findAll());

    return "fourthDay/task/task";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
     model.addAttribute("task",new Task());
     model.addAttribute("behaviours", Behavior.values());
    return "fourthDay/task/addTask";
  }


  @PostMapping
  public String persist(@ModelAttribute Task task) {
    taskService.persist(task);
    return "redirect:/task";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("task", taskService.findById(id));
    model.addAttribute("behaviours", Behavior.values());
    return "fourthDay/task/addTask";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("taskDetail", taskService.findById(id));
    return "fourthDay/task/task-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    taskService.deleteById(id);
    return "redirect:/task";
  }
}

