package com.camel.multicast;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class MulticastAggregator implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		// TODO Auto-generated method stub
		Integer oldBid=0;
		if(oldExchange!=null){
			oldBid = oldExchange.getIn().getHeader("Bid", Integer.class);
		}
		Integer newBid = newExchange.getIn().getHeader("Bid", Integer.class);
        return (newBid > oldBid) ? newExchange : oldExchange;
	}

}
