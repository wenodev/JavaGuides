package com.weno.springbootcrudtest;

import com.weno.springbootcrudtest.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootcrudtestApplication {

	public static void main(String[] args) {

		System.out.println(String.class);
		System.out.println(User.class);


		SpringApplication.run(SpringbootcrudtestApplication.class, args);
	}

}
