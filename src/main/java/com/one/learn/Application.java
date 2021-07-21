package com.one.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.one")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
