package com.example.exercisedp.controller;

import com.example.exercisedp.models.Company;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ControllerImpl implements Controller{

    private List<Company> companies;

    @Override
    public void load() {

        try{
            companies = new ArrayList<>();
            Scanner read = new Scanner(new File("src/main/java/com/example/exercisedp/data/companies.txt"));
            while(read.hasNextLine()){
                String text = read.nextLine();
                companies.add(new Company(text));
            }
        }catch (FileNotFoundException e){
            e.getMessage();
        }
    }

    @Override
    public void afisare() {

        for (Company c: companies){
            System.out.println(c);
        }
    }
}
