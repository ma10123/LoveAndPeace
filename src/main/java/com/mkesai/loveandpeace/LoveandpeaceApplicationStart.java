package com.mkesai.loveandpeace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class LoveandpeaceApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(LoveandpeaceApplicationStart.class, args);
    }

}
