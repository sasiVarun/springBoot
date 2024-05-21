package com.test.service;

import java.util.Optional;

import com.test.entity.User;

public interface IUserService {
	
	Integer saveUser(User user);
	Optional<User> findUserByEmail(String email);
}
