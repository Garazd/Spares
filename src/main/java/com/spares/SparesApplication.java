package com.spares;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.spares")
public class SparesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparesApplication.class, args);
    }
}