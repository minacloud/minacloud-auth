package com.minacloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.minacloud"})
public class LaunchApplication {
    public static void main(String[] args) {
        SpringApplication.run(LaunchApplication.class, args);
    }

}
