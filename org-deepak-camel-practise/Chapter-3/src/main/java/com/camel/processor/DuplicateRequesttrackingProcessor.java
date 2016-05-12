package com.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class DuplicateRequesttrackingProcessor implements Processor {
	Logger log = Logger.getLogger(DuplicateRequesttrackingProcessor.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		log.debug("This is a duplicate tracking processor");

	}

}
