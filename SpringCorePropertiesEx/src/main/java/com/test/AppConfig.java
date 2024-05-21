package com.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // Spring Container take this inputs
@ComponentScan("com.test")  // to find classes
@PropertySource("classpath:db.properties") // to load properties file
public class AppConfig {

}
