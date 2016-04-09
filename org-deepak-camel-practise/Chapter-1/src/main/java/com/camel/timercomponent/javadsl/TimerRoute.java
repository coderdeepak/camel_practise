package com.camel.timercomponent.javadsl;

import org.apache.camel.builder.RouteBuilder;

/**
 * camel-stream – This dependency is used to send output to the console. We have added this in out pom.xml
 * 
 * Camel’s timer component is used to schedule any tasks to occur either at a specified time or at regular intervals.
 * 
 * Timer is Camel’s core component. Its URI scheme is timer:
 * 
 * A timer component generates events which in turn triggers the endpoint. 
 * A timer component uses uses the JRE’s built-in timer mechanism to generate message exchanges at regular intervals. 
 */

public class TimerRoute extends RouteBuilder {

	
	@Override
	public void configure() throws Exception {
		from("timer://mytimeobject?period=1000")
		.setBody(simple("Timer event triggered at ${header.firedTime}"))
		.to("stream:out");
	}
	
	/**
	 * Once above route is invoked following message is generated in console in every one sec.
	 * 	Timer event triggered at Tue Apr 05 20:31:47 IST 2016
		Timer event triggered at Tue Apr 05 20:31:48 IST 2016
		Timer event triggered at Tue Apr 05 20:31:49 IST 2016
	 * 
	 */

}
