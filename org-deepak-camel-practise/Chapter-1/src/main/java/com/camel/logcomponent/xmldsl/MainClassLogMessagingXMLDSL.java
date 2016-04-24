package com.camel.logcomponent.xmldsl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassLogMessagingXMLDSL {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("log-component-xml-dsl.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();

	}

}
