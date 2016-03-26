package com.camel.intro;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopierJavaDSLVeryBasic {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new MyRouteBuilder());
		camelContext.start();
		Thread.sleep(10000);
		camelContext.stop();
	}

}
