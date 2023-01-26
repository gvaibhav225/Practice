package com.example.springbootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "com.example.springbootstart.*")
@EntityScan("com.example.springbootstart.*")
@EnableJpaRepositories(basePackages = "com.example.springbootstart.repository")
public class SpringbootstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootstartApplication.class, args);
	}

}
