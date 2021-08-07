package com.spring_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.spring_annotations") //Optional, to work with Annotations, if you don't want, remove.
@PropertySource("classpath:inject.properties")
public class SportConfig {
    @Bean
    FortuneService sadFortuneService(){   // vvv down
        return new SadFortuneService();
    }

    @Bean
    FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    FortuneService randomFortuneService(){
        return new RandomFortuneService();
    }

    @Bean
    Coach swimCoach(){                    // ^^^ up tied
        return new SwimCoach(sadFortuneService());
    }

    @Bean
    Coach tennisCoach(){
        return new TennisCoach(happyFortuneService());
    }
}
