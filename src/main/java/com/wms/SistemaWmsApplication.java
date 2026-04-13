package com.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@SpringBootApplication
public class SistemaWmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SistemaWmsApplication.class, args);
    }

    @Bean
    public ApplicationListener<ApplicationReadyEvent> applicationReadyEventApplicationListener() {
        return event -> {
            System.out.println("Application started successfully!");
            System.out.println("Available URLs:");
            System.out.println("Localhost: http://localhost:8080");
            System.out.println("Swagger UI: http://localhost:8080/swagger-ui.html");
            System.out.println("H2 Console: http://localhost:8080/h2-console");
        };
    }
}