package com.test.gen;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TextGen {
	
	@Scheduled(fixedRate = 5000)
	public void showText() throws InterruptedException {
		System.out.println("Hello " + new Date());
		Thread.sleep(7000);
	}
}
