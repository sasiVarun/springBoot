package com.test.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	//Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("SAM").password("{noop}SAM").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("AJAY").password("{noop}AJAY").authorities("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("SYED").password("{noop}SYED").authorities("STUDENT");
	}
	
	//Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/welcome").permitAll()
		.antMatchers("/admin").hasAuthority("ADMIN")
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.and()
		.logout();
		
	}

}
