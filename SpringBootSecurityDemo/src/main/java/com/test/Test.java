package com.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
	
	public static void main(String[] args) {
		String text = "SAM";
		BCryptPasswordEncoder encoder  = new BCryptPasswordEncoder();
		System.out.println(encoder.encode(text));
	}

}
