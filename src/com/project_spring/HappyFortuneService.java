package com.project_spring;

public class HappyFortuneService implements FortuneService {
    String sjs = getFortune();
    @Override
    public String getFortune() {
        return "LUCKY DAY!";
    }

    @Override
    public String toString() {
        return sjs;
    }
}
