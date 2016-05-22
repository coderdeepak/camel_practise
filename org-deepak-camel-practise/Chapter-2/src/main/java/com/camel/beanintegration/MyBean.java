package com.camel.beanintegration;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.log4j.Logger;

public class MyBean {
	
	Logger log = Logger.getLogger(MyBean.class);
	
	public void processExchange(Exchange exchange){
		  String valueOfAnyName =  (String)exchange.getIn().getHeader("anyName");
		  log.debug(valueOfAnyName);
		  exchange.getIn().setBody("This is the new body");
	}
	
	/**
	 * This method process exchange body ; It takes exchange body as input and what ever it returns is new exchange body
	 * 
	 * @param body : current exchange body
	 * @return : New Exchange body
	 */
	public String processExchangeBody(String body){
		log.debug("current exchange body is --->" + body );
		return "This is the new exchange body";
	}
	
	
	public void processExchangeUsingAnnotations(@Header("user") String localUser,@Body String body,Exchange exchange){
		log.debug("current exchange body is --->" + body );
		log.debug(" value of header user is " + localUser);
		exchange.getIn().setBody("This is the new body created from 'processExchangeUsingAnnotations'");
	}
	
	

}
