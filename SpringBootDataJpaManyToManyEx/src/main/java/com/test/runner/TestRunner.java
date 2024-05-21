package com.test.runner;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Course;
import com.test.entity.Student;
import com.test.repo.CourseRepository;
import com.test.repo.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	CourseRepository crepo;
	@Autowired
	StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(85, "Course Java", 200.00);
		Course c2 = new Course(86, "Advanced Java", 400.00);
		Course c3 = new Course(87, "Spring Boot", 500.00);
		Course c4 = new Course(88, "Microservice", 600.00);
		
		crepo.saveAll(Arrays.asList(c1,c2,c3,c4));
		
		Student s1 = new Student(1051, "AJAY", Set.of(c2,c4));
		Student s2 = new Student(1052, "SAM", Set.of(c1,c2));
		Student s3 = new Student(1053, "SYED", Set.of(c3,c4));
		
		srepo.saveAll(Arrays.asList(s1,s2,s3));
		
	}

}
