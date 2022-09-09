package com.example.exercisedp;

import com.example.exercisedp.controller.ControllerImpl;
import com.example.exercisedp.models.Company;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExerciseDpApplication {

    @Autowired
    Company company;

    public static void main(String[] args) {
        SpringApplication.run(ExerciseDpApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(@Qualifier("hp")Company company1, Company company2, ControllerImpl controller){
        return args -> {

            Faker faker = new Faker();

//            System.out.println("company1: " + company1);
//            System.out.println("company2: " + company2);
//            System.out.println("autowired company: " + company);
//
//            for(int i=0;i<5;i++){
//                Company c = new Company(i, faker.company().name(), faker.country().capital(), faker.company().industry());
//                System.out.println(c.describe());
//            }
            controller.afisare();
        };
    }

}
