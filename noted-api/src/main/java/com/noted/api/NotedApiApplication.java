package com.noted.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.noted")
public class NotedApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(NotedApiApplication.class, args);
  }
}
