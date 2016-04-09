package com.camel.timercomponent.javadsl;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import com.camel.intro.MyRouteBuilder;

public class CamelTimerSimpleExample {

	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new TimerRoute());
		context.start();
		Thread.sleep(10000);
		context.stop();
		

	}

}
