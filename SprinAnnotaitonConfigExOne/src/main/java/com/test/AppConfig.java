package com.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Input to Spring Container
@ComponentScan("com.test") // package name to find classes
public class AppConfig {

}
