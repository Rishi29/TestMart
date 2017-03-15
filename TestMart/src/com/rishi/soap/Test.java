package com.rishi.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Test {
	@WebMethod
	 public String send(){
		 return "hello world";
	 }

}
