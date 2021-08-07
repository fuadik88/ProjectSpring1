package com.spring_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach);

        context.close();
    }
}
