package io.yadnyesh.learningspringboot.learningspringboot.spock.service;

import io.yadnyesh.learningspringboot.learningspringboot.spock.exception.AuthenticationException;
import io.yadnyesh.learningspringboot.learningspringboot.spock.model.User;
import io.yadnyesh.learningspringboot.learningspringboot.spock.repository.UserRepository;
import io.yadnyesh.learningspringboot.learningspringboot.spock.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public boolean processUser(String name) {
		User user = userRepository.findOneByName(name);
		if (user == null) {
			throw new AuthenticationException("User is not found");
		}
		return true;
	}
	
	
	public int sum(int a, int b) {
		return a + b;
	}
}
