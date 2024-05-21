package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
