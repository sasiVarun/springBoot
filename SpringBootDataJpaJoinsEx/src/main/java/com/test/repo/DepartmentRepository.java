package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
