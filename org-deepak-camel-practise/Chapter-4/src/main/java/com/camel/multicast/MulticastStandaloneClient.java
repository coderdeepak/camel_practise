package com.camel.multicast;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MulticastStandaloneClient {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("multicast/multicast.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();

	}

}
