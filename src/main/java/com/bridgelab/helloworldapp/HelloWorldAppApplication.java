package com.bridgelab.helloworldapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldAppApplication {

    public static void main(String[] args) {

        System.out.println("Hello from CFP 200");
        SpringApplication.run(HelloWorldAppApplication.class, args);
    }

}
