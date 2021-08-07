package com.spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService happyFortuneService; //originally fortuneService

    /*public CricketCoach(FortuneService hFS){
        this.happyFortuneService =hFS;
    }*/

    /*@Autowired
    public void setHappyFortuneService(FortuneService hFS){
        System.out.println("Fortune Service SET!");
        this.happyFortuneService = hFS;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Do get down";
    }

    @Override
    public String getDailyFortune() {
        return happyFortuneService.getFortune();
    }
}
