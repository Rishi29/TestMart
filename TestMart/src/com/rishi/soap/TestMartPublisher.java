package com.rishi.soap;

import javax.xml.ws.Endpoint;
/**
 * @author Rishi
 * java code to test web service, here we are using code to test the web service instead of using tools.
 * we do not need server to test, we can run this as java application
 *
 *
 */

public class TestMartPublisher {
	
	public static void main(String[]args){
		/**
		 * By default the below given code is single thread, i.e when one thread is using this, the other has to wait.
		 * and it is ok in development environment.
		 * 
		 * it accepts two argument one the url where you want to publish service, put any free port here 1234 is used. 
		 * another argument is the instance of  the endpoint.
		 * 
		 * if we use glass fish to test webservice then there is multi thread environment.
		 */
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}

}
