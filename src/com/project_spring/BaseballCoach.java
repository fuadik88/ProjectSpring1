package com.project_spring;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes Daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "BaseballCoach{" +
                "fortuneService=" + fortuneService +
                '}';
    }
}
