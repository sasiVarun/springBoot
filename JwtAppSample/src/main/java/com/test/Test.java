package com.test;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Test {

	public static void main(String[] args) {
		String key = "Robert";
		
		/* Token Generation */
		String token = Jwts.builder()
		.setId("345AES")
		.setSubject("James")
		.setIssuer("Capgemini")
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5)))
		.signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(key.getBytes()))
		.compact();
		
		System.out.println(token);
		
		/* Reading Token/ Parsing Token */
		Claims claim =Jwts.parser()
		.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
		.parseClaimsJws(token)
		.getBody();
		
		System.out.println(claim.getId());
		System.out.println(claim.getSubject());
		System.out.println(claim.getIssuer());
		System.out.println(claim.getIssuedAt());
		System.out.println(claim.getExpiration());
	}

}
