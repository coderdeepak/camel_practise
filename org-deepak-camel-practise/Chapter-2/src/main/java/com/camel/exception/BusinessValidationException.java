package com.camel.exception;



public class BusinessValidationException extends Exception {
	private static final long serialVersionUID = 1997753363232807009L;
	public BusinessValidationException(String mssg){
		super(mssg);
	}
}
