package com.spring_annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "AnyMethod Lucky Day";
    }
}
