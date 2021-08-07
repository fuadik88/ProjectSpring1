package com.spring_annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    String[] pickRandom = {"Beware of the Wolf in sheep's cloth",
    "Diligence is the mother of fucker", "The journey is the REWARD!"};

    Random random = new Random();

    @Override
    public String getFortune() {
        return pickRandom[random.nextInt(pickRandom.length)];
    }
}
