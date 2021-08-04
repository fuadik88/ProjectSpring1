package com.project_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
