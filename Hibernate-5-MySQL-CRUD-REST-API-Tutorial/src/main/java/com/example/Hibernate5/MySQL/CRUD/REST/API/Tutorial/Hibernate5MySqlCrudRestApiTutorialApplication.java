package com.example.Hibernate5.MySQL.CRUD.REST.API.Tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Hibernate5MySqlCrudRestApiTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hibernate5MySqlCrudRestApiTutorialApplication.class, args);
	}

}
