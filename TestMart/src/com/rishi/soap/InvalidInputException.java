package com.rishi.soap;

//custom exception class
public class InvalidInputException extends Exception {
	
 private String errorDetails;
 
 public InvalidInputException( String reason, String errorDetails){
	 super(reason);
	 this.errorDetails=errorDetails;
 }
 
 public String getFaultInfo(){
	 return errorDetails;
 }
 
}
