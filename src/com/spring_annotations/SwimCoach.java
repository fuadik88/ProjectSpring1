package com.spring_annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    private final FortuneService sadFortuneService;
    @Value("${add.email}") private String email;
    @Value("${add.team}") private String team;

    public SwimCoach(FortuneService sadFortuneService) {
        this.sadFortuneService = sadFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do Swimming like swinging";
    }

    @Override
    public String getDailyFortune() {
        return sadFortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "SwimCoach{" +
                "email='" + email + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
