package com.rishi.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.rishi.soap.business.ProductServiceImpl;
import com.rishi.soap.model.Product;

@WebService(endpointInterface="com.rishi.soap.ProductCatalogInterface" , portName="TestMartCatalogPort" ,serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface  {
	
	ProductServiceImpl productService = new ProductServiceImpl ();
	
	/* (non-Javadoc)
	 * @see com.rishi.soap.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	
	public List<String> getProductCategories(){
	return productService.getProductCategories();
		
	}
	
	/* (non-Javadoc)
	 * @see com.rishi.soap.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see com.rishi.soap.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	} 
	/* (non-Javadoc)
	 * @see com.rishi.soap.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}

}
