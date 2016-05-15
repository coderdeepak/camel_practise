package com.camel.customprocessor;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class RandomProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		throw new IOException(" a random exception that occured while processing");

	}

}
