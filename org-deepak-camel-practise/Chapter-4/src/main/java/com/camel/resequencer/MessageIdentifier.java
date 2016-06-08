package com.camel.resequencer;

import java.util.Random;

public class MessageIdentifier {
	
	public int getMessageBody(){
		Random random = new Random();
		return random.nextInt(50);
	}

}
