package com.camel.intro;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:data/inbox").to("file:data/outbox");
		//from("file:data/inbox?noop=true").to("file:data/outbox");
	}

}
