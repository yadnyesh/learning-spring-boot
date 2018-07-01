package io.yadnyesh.learningspringboot.learningspringboot.spock.repository;

import io.yadnyesh.learningspringboot.learningspringboot.spock.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Override
	public User findOneByName(String name) {
		throw new UnsupportedOperationException("You should implement this, if you want");
	}
}
