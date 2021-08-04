package com.project_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = applicationContext.getBean("myCricketCoach", CricketCoach.class);
    }
}
