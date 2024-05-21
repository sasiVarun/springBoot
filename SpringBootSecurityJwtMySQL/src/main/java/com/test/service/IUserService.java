package com.test.service;

import java.util.Optional;

import com.test.model.User;

public interface IUserService {
	
	public Integer saveUser(User user);
	Optional<User> findByUsername(String username);
}
