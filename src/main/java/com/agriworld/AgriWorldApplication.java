package com.agriworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AgriWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriWorldApplication.class, args);
	}

}
