package com.test;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	
	public String generateToken(String id, String subject, String key) {
		return Jwts.builder()
				.setId(id)
				.setSubject(subject)
				.setIssuer("Capgemini")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1)))
				.signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(key.getBytes()))
				.compact();
	}
	
	public Claims getClaims(String token, String key) {
		return Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
				.parseClaimsJws(token)
				.getBody();
	}

}
