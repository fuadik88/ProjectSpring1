package com.spring_annotations;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Maybe next Time :'(";
    }
}
