package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.User;
import com.test.repo.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository repo; // HAS-A
	
	@Override
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getUid();
	}

}
