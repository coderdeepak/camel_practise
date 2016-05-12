package com.camel.customprocessor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * This custom processor is responsible to Authenticate incoming request.
 * @author Heer
 *
 */
public class AuthenticationProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		/** to make it simple we are not going to write any authentication logic in this
		 *  here we are just setting a header "name" whose value is "Deepak"
		 *  We are going to use this header in the log processor defined in the route.  
		 */
		exchange.getIn().setHeader("name", "Deepak");
	}
}
