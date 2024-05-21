package com.test;

import io.jsonwebtoken.Claims;

public class TestJwtUtil {
	
	public static void main(String[] args) {
		String key = "Robert";
		JwtUtil util = new JwtUtil();
		String token = util.generateToken("ABC", "Michael", key);
		System.out.println(token);
		token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJBQkMiLCJzdWIiOiJNaWNoYWVsIiwiaXNzIjoiQ2FwZ2VtaW5pIiwiaWF0IjoxNzA0Mzc5NzE1LCJleHAiOjE3MDQzNzk3NzV9.01dWwQrn76298ypy7xUJw7xBXQ39XJ6D81lDHyOxP8k";
		Claims claim = util.getClaims(token, key);
		System.out.println(claim.getSubject());
		System.out.println(claim.getExpiration());
	}

}
