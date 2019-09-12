package com.luv2code.springboot.demo.myfirstspringbootapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

  //expose "/" that return "Hello World"

  @GetMapping("/")
  public String sayHello() {
    return "Hello World! Time on server is " + LocalDateTime.now();
  }


  //expose endpoint that for "workout"

  @GetMapping("/workout")
  public String getDailyWorkout() {
    String toReturn = "Run a hard 5k";
    return toReturn;
  }

  @GetMapping("/fortune")
  public String getDailyFortune() {
    String toReturn = "Today is your lucky day";
    return toReturn;
  }





}
