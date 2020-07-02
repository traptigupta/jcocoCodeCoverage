package com.jd.jacoco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})

public class JacocoCodeCoverageExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JacocoCodeCoverageExampleApplication.class, args);
	}

}
