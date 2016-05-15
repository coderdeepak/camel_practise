package com.camel.exception;

public class FieldValidationException extends Exception {
	private static final long serialVersionUID = 1997753363232807009L;
	public FieldValidationException(String mssg){
		super(mssg);
	}
}
