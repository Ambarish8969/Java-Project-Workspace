package com;

public class InvalidQuantityException extends Exception{
	private String message;
	
	public InvalidQuantityException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
