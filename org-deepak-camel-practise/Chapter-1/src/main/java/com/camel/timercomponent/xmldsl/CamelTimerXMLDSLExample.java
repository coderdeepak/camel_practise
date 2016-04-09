package com.camel.timercomponent.xmldsl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelTimerXMLDSLExample {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("timer-component-xml-dsl.xml");
		context.start();
		Thread.sleep(10000);
		context.stop();

	}

}
