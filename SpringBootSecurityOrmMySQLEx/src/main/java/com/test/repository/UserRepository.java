package com.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("SELECT usr FROM User usr WHERE usr.email=:email")
	Optional<User> findByEmail(String email);

}
