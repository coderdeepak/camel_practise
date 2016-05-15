package com.camel.customprocessor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.camel.exception.FieldValidationException;

public class BusinessValidationProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String mssgBody = (String)exchange.getIn().getBody();
		this.validateRequest(mssgBody);

	}
	
	private void validateRequest(String mssgBody)throws Exception{
		throw new FieldValidationException("This is a BusinessValidationException");
	}

}
