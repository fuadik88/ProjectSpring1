package com.spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope ("prototype")
public class TennisCoach implements Coach {
    private final FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    /*@Autowired
    @Qualifier ("happyFortuneService")//to say Spring which FortuneService class to use (HappyFortune, RandomFortune etc.)
    public void doSomething(FortuneService fS){
        this.fortuneService = fS;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice some hip-HOP";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
