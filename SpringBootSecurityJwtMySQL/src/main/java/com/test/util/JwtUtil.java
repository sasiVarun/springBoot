package com.test.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

	@Value("${app.secret}")
	private String secret;
	
	//Generate Token
	public String generateToken(String subject) {
		return Jwts.builder()
				.setSubject(subject)
				.setIssuer("Capgemini")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+ TimeUnit.MINUTES.toMillis(5)))
				.signWith(SignatureAlgorithm.HS512, secret.getBytes())
				.compact();
	}
	
	//Read Claims
	public Claims getClaims(String token) {
		return Jwts.parser()
				.setSigningKey(secret.getBytes())
				.parseClaimsJws(token)
				.getBody();
	}
	
	// Read Expiry Date
	public Date getExpiryDate(String token) {
		return getClaims(token).getExpiration();
	}
	
	//Read Subject/Username
	public String getUsername(String token) {
		return getClaims(token).getSubject();
	}
	
	//Validate Expiry Date
	public boolean isTokenExpired(String token) {
		Date expDate = getExpiryDate(token);
		return expDate.before(new Date(System.currentTimeMillis()));
	}
	
	//Validate user name in token and database, expDate
	public boolean validateToken(String token, String username) {
		String tokenUserName = getUsername(token);
		return (username.equals(tokenUserName) && !isTokenExpired(token));
		
	}
}
