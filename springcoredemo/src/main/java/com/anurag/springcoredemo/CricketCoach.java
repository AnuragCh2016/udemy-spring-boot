package com.anurag.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

  @Override
  public String getDailyWorkout(){
    return "Bowl 200 balls and be Bumrah!! You can be Shami too but not Siraj";
  }
}
