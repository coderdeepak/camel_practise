package com.camel.loadbalancer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadbalancerStandaloneClient {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("loadbalancer/loadbalancer.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();
	}

}
