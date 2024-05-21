package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
