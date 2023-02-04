package com.example.javaspringboot.model;

public class Product {


	private String productId;

	private String productName;
	
	private String productImage;

	private String productDescription;


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}

	
	public String getProductName() {
		return productName;
	}

	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public String getProductImage() {
		return productImage;
	}

	
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	
	public String getProductDescription() {
		return productDescription;
	}

	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}