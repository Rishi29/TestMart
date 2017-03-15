package com.rishi.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.rishi.soap.model.Product;

@WebService(name="TestMartCatalog",
targetNamespace="http://testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories") // This annotation is optional
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductsv2(String category);

	@WebMethod
	
	boolean addProduct(String category, String product);

}