package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot0101DemoApplication {



  public static void main(String[] args) {
    System.out.println(Springboot0101DemoApplication.class);
    SpringApplication.run(Springboot0101DemoApplication.class, args);
  }

}
