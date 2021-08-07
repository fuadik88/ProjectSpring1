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

    private void doStartup(){
        System.out.println("STARTED UP!");
    }

    private void doCleanup(){
        System.out.println("CLEANED UP!");
    }

    @Override
    public String toString() {
        return "TrackCoach:" + fortuneService;
    }
}
