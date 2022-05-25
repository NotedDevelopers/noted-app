package com.noted.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.noted")
public class NotedAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(NotedAdminApplication.class, args);
  }
}
