package com.camel.logcomponent.javadsl;

import org.apache.camel.CamelContext;
import org.apache.camel.component.log.LogComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.log4j.Logger;

public class MainClassLogMessagejavaDSL {

	final static Logger logger = Logger.getLogger(MainClassLogMessagejavaDSL.class);
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//logger.info("**start**");
		CamelContext context = new DefaultCamelContext();
		/*
		 * This is how you are instantiating and registering the Log Component in Camel Context
		 * Now inside the route you can use myLogger: schema for LogComponent.
		 * 
		 * If you don't register LogComponent , it can be used with it's default schema which is log: 
		 */
		context.addComponent("mylogger", new LogComponent());
		context.addRoutes(new LogMessageOnTimerEventRouteBuilder());
		context.start();
		Thread.sleep(1000);
		context.stop();
		//logger.error("**finish**");

	}

}
