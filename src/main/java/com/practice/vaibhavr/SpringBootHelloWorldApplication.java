package com.practice.vaibhavr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("password");
        System.out.println("Password is " + password);
    }
}
