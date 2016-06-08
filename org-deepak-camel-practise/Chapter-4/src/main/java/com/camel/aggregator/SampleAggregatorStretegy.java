package com.camel.aggregator;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.log4j.Logger;

public class SampleAggregatorStretegy implements AggregationStrategy {
	Logger log = Logger.getLogger(SampleAggregatorStretegy.class);
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		String body = newExchange.getIn().getBody(String.class);
        if (oldExchange == null) {
            return newExchange;
        } else {
        	String oldBody = oldExchange.getIn().getBody(String.class);
        	String newBody = newExchange.getIn().getBody(String.class);
        	String newBody1 = oldBody + "," + newBody;
        	oldExchange.getIn().setBody(newBody1);
        	return oldExchange;
        }
		
	}

}
