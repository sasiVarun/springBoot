package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
