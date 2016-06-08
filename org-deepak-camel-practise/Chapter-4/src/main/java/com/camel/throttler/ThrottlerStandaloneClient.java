package com.camel.throttler;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThrottlerStandaloneClient {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("throttler/throttler.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();
	}

}
