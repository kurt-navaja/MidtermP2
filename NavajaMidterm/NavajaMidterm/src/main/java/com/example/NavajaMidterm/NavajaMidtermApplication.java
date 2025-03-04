package com.example.NavajaMidterm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Controller"})
public class NavajaMidtermApplication {

    public static void main(String[] args) {
        SpringApplication.run(NavajaMidtermApplication.class, args);
    }
}