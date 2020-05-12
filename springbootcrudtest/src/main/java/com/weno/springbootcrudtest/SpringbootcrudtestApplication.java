package com.weno.springbootcrudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootcrudtestApplication {
//git test
	public static void main(String[] args) {

		SpringApplication.run(SpringbootcrudtestApplication.class, args);
	}

}
