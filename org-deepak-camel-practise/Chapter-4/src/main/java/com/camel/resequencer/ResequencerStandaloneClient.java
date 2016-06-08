package com.camel.resequencer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResequencerStandaloneClient {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resequencer/resequencer.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();
	}

}
