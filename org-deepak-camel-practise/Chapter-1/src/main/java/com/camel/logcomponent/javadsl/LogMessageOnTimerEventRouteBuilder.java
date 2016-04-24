package com.camel.logcomponent.javadsl;

import org.apache.camel.builder.RouteBuilder;

/**
 * Since its a route builder it extends RouteBuilder class of Camel.
 * @author Heer
 *
 */
public class LogMessageOnTimerEventRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://mytimeobject?period=1000")
		/*
		 * insideTheRoute is just a key word (an identifier)
		 * showHeaders=true means in log show headers of exchange 
		 */
		
		.to("log:insideTheRoute?showHeaders=true")
		/*
		 * The above way of logging was using LogComponent.
		 * This one (.log) is using log DSL not by Log Component.
		 */
		.log("Event triggered by {property.camelTimerName} " + "at {header.firedTime}");
	}

}
