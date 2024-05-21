package com.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	//Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
	}
	
	//Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/user/register", "/user/save","/user/login").permitAll()
		.antMatchers("/welcome").permitAll()
		.antMatchers("/home").authenticated()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/emp").hasRole("EMPLOYEE")
		.anyRequest().authenticated()
		
		.and()
		.formLogin()
		.loginPage("/user/login") // to show login page
		.loginProcessingUrl("/login") //POST
		.defaultSuccessUrl("/home",true)
		.failureUrl("/user/login?error=true") // On login failed
		
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/user/login?logout=true")
		
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied")
		;
	}

}
