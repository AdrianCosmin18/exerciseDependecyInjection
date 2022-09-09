package com.example.exercisedp;

import com.example.exercisedp.models.Company;
import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configurator {

    @Bean(name = "hp")
    public Company getHP(){
        System.out.println("HP Company !!!");
        return new Company("HP", "Australia", "it");
    }

    @Bean
    @Primary
    public Company getRandomCompany(){

        Faker faker = new Faker();
        return new Company(faker.company().name(), faker.country().capital(), faker.company().industry());
    }
}
