package io.yadnyesh.learningspringboot.learningspringboot.spock.repository;

import io.yadnyesh.learningspringboot.learningspringboot.spock.model.User;

public interface UserRepository {
	User findOneByName(String name);
}