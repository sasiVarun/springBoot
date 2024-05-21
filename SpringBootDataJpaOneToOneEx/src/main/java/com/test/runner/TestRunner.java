package com.test.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Admin;
import com.test.entity.Branch;
import com.test.repo.AdminRepository;
import com.test.repo.BranchRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	BranchRepository brepo;
	@Autowired
	AdminRepository arepo;
	@Override
	public void run(String... args) throws Exception {
		
		Admin a1 = new Admin(55, "AJAY", "ANY");
		Admin a2 = new Admin(56, "SAM", "TNR");
		
		arepo.saveAll(Arrays.asList(a1,a2));
		
		Branch b1 = new Branch(152, "CORE", a1);
		Branch b2 = new Branch(153, "SUP", a2);
		
		brepo.saveAll(Arrays.asList(b1,b2));
	}

}
