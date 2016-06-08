package com.camel.throttler;


public class ThrottlerSupport {

	private static int count = 0;
	
	public int getBody(){
		return count++;
	}
}
