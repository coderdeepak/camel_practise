package com;

public enum Fruits {
	
	Kiwi(300),Apple(200),Watemelon(40);
	
	private int prize;
	
	Fruits(int p){
		prize=p;
	}
	
	public int getPrize(){
		return prize;
	}

}
