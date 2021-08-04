package com.project_spring;

public class SavateCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Triple low knee kicks!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
