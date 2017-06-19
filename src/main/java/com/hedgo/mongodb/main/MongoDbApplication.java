package com.hedgo.mongodb.main;

import com.hedgo.mongodb.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = "com.hedgo")
public class MongoDbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MongoDbApplication.class, args);

        //Super wyswietla wszystkie beany springa:
        Arrays.asList(context.getBeanDefinitionNames()).forEach(i -> System.out.println("BEAN=" + i));
        ((CustomerService) context.getBean("customerService")).run();
    }
}
