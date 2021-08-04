package com.project_spring;

public class TrackCoach implements Coach {
    private HappyFortuneService fortuneService;

    public TrackCoach(HappyFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "TrackCoach:" + fortuneService;
    }
}
