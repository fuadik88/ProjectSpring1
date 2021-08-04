package com.project_spring;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("Object: 'Cricket Coach' created!");
    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
