package com.spring_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotations_applicationContext.xml");

        Coach coach = context.getBean("sillyCoach", Coach.class);
        Coach alphaCoach = context.getBean("sillyCoach", Coach.class);

        System.out.println(coach.hashCode() + " | " + alphaCoach.hashCode());
        System.out.println(coach.getDailyFortune());
        System.out.println(alphaCoach.getDailyFortune());

        context.close();

    }
}
