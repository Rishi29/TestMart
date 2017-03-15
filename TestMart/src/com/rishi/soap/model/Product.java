package com.rishi.soap.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//this annotation tell that below class is root element for xml. if we have any member variable 
//like reference of another class then that wont be part of root element
@XmlRootElement(name="Product")

// this annotation gives us facility to customize in more way.
@XmlType(propOrder={"price","sku","name"})
public class Product {
	/**
	 * JAXB annotation need no-arg constructor to initialize object as it need it to 
	 * convert java object to xml.
	 * **/
	public Product(){
		
	}
	
	private String name;
	private String sku;
	private double price;
	
	public Product(String name, String sku, double price){
		this.name= name;
		this.price=price;
		this.sku=sku;
	}

	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
