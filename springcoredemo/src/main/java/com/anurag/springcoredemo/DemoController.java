package com.anurag.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  private final Coach myCricketCoach;

  @Autowired
  public DemoController(Coach coach){
    myCricketCoach = coach;
  }

  @GetMapping("/workout")
  public String getWorkout(){
    return myCricketCoach.getDailyWorkout();
  }
}
