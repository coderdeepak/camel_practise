package com.camel.loadbalancer;


public class LoadbalancerSupport {

	private static int count = 0;
	
	public int getBody(){
		return count++;
	}
}
