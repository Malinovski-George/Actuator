package com.example.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.custom")
public class ActuatorApplication {

  public static void main(String[] args) {
    SpringApplication.run(ActuatorApplication.class, args);
  }
}
