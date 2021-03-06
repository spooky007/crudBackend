package com.bliztech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bliztech.entity.User;
import com.bliztech.repository.UserRepository;

//@ComponentScan(basePackages={"com.bliztech"})
@EnableJpaRepositories(basePackages="com.bliztech.repository")
@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.save(new User("one", "one"));
		userRepository.save(new User("two", "two"));
		userRepository.save(new User("three", "three"));
	}
}
