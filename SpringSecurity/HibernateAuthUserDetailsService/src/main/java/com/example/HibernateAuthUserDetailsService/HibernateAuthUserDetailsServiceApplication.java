package com.example.HibernateAuthUserDetailsService;

import com.example.HibernateAuthUserDetailsService.model.User;
import com.example.HibernateAuthUserDetailsService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class HibernateAuthUserDetailsServiceApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(HibernateAuthUserDetailsServiceApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		userRepository.save(new User("ramesh", bCryptPasswordEncoder.encode("ramesh")));
	}


}
