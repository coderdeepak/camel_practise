package com.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

/**
 * 
 * @author Heer
 *
 */
public class AuthenticationProcessor implements Processor {

	Logger log = Logger.getLogger(AuthenticationProcessor.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		log.debug("Inside authentication processor");
	}

}
