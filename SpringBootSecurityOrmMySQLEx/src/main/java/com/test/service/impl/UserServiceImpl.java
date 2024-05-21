package com.test.service.impl;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.repository.UserRepository;
import com.test.service.IUserService;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService{

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	public Integer saveUser(User user) {
		//encode password and set back to same object
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		return repo.save(user).getId();
	}

	@Override
	public Optional<User> findUserByEmail(String email) {
		return repo.findByEmail(email);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> opt = findUserByEmail(username);
		if(opt.isEmpty())
			throw new UsernameNotFoundException("Email Not Exist");
		else {
			User user = opt.get();
			return new org.springframework.security.core.userdetails.User(
					user.getEmail(), 
					user.getPassword(),
					user.getRoles().stream()
					.map(role -> new SimpleGrantedAuthority(role))
					.collect(Collectors.toSet()));
		}
	}

}
