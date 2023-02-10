package com;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	
	public InsufficientBalanceException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message; 
	} 
}

// Rules to work with Custom/User-Defined Exception....
// 1.  Create a class with the Exception Name.
// 2a. If class extends RuntimeException -> Unchecked Exception.
// 2b. If class extends Exception -> Checked Exception.
// 3.  Override getMessage() -> (variable, constructor, method)
// 4.  Invoke the Exception object using throw keyword, handle it
//     using try & catch block with suitable message.