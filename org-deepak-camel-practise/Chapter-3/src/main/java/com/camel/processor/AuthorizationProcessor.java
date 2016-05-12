package com.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.processor.interceptor.Debug;
import org.apache.log4j.Logger;

public class AuthorizationProcessor implements Processor{
	Logger log = Logger.getLogger(AuthorizationProcessor.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		log.debug("This is Authorization Processor");
		
	}

}
