package com.naresh.corejava.exceptionhandling;

//customised exception
public class InvalidDataException extends RuntimeException {
	
   public InvalidDataException(String msg) {
		super(msg);
   }

}
