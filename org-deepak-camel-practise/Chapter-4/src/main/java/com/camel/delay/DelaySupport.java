package com.camel.delay;


public class DelaySupport {

	private static int count = 0;
	
	public int getBody(){
		return count++;
	}
}
