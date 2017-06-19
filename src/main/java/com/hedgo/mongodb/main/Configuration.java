package com.hedgo.mongodb.main;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@org.springframework.context.annotation.Configuration
@EnableMongoRepositories(basePackages = "com.hedgo")
@ComponentScan(basePackages = "com.hedgo")
public class Configuration {

/*
    public @Bean MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("127.0.0.1"), "yourdb");
        return mongoTemplate;
    }
*/

}
