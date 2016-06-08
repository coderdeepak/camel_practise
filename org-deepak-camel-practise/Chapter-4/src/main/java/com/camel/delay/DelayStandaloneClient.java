package com.camel.delay;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DelayStandaloneClient {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("delay/delay.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();
	}

}
