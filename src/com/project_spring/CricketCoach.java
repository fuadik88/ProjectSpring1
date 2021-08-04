package com.project_spring;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach(){
        System.out.println("Object: 'Cricket Coach' created!");
    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTeam(String team){
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Email: " + email + "\nTeam: " + team + "\n" + fortuneService;
    }
}