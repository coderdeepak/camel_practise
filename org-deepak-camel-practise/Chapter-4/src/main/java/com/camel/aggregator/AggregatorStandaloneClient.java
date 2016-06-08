package com.camel.aggregator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AggregatorStandaloneClient {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aggregator/aggregator.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();

	}

}
