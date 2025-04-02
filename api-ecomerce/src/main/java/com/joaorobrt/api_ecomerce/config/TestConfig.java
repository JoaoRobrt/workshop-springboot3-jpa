package com.joaorobrt.api_ecomerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joaorobrt.api_ecomerce.entities.User;
import com.joaorobrt.api_ecomerce.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Bianca Meira", "biancavmeiraa@gmail.com", "985476932", "123456");
		User u2 = new User(null, "João Roberto", "joaorobertogalvao.2008@gmail.com", "985468741", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
