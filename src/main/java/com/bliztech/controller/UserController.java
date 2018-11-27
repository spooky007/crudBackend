package com.bliztech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bliztech.entity.User;
import com.bliztech.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		
		return userRepository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		
		userRepository.deleteById(id);
		
		return true; 
	}
	
	@PostMapping("/user")
	public User createuser(User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

}
