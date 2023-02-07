package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello Uniess");
        System.out.println("Hello Git Test");

        SpringApplication.run(DemoApplication.class, args);
    }

}
