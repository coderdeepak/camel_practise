package com.camel.intro;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/***
 * 
 * @author Deepak
 *
 */

public class FileCopierJavaDSL {
	
	public static void main(String[] args)  {
		//create a camel context
		CamelContext context = new DefaultCamelContext();
		// create a route builder
		RouteBuilder rb = new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				/*
				 * create a route, code mentioned below is a route
				 * File will be copied from endpoint (data/inbox) to endpoint(data/outbox)
				 * As mentioned in document an endpoint consists of 3 parts, in this case
				 * 
				 * File= represents camel's FileComponent
				 * data/inbox = context path
				 * noop = true = options
				 *  
				 */
				from("file:data/inbox?noop=true").to("file:data/outbox");
				
			}
		};
		try{
			context.addRoutes(rb);
			
		    // start the route and let it do its work
		    context.start();
		    Thread.sleep(10000);

		    // stop the CamelContext
		    context.stop();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	
	

}
