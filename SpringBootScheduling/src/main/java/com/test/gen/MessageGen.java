package com.test.gen;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class MessageGen {

	@Scheduled(fixedDelay = 2000)
	public void showMessage() throws InterruptedException {
		System.out.println("Hello " + new Date());
		Thread.sleep(5000);
	}

}
