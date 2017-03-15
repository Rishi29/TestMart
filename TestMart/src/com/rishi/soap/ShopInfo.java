package com.rishi.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
//@SOAPBinding(style=Style.RPC) //for RPC style binding 
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookUpOutPut")
	public String getShopInfo(@WebParam(partName="lookUpInput")String property) throws InvalidInputException{
		String response=null;
		if("shopName".equals(property)){
			response="Test Mart";
		}
		else if ("since".equals(property)){
			response="since 2012";
		}
		else {
			
			throw new InvalidInputException("Invalid Input",property+" is not valid input");
		}
		return response;
	}

}
