package com.javadeveloperzone.log4j.controller;

public class Demobject {
	private String productid = "qert";
	private String productname = "qwerty";
	private Float price = (float) 50;
	private String description = "qwerty sdfghj zxcvb" ;
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Demobject [productid=" + productid + ", productname=" + productname + ", price=" + price
				+ ", description=" + description + "]";
	}
	
}
