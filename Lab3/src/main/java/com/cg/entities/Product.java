package com.cg.entities;

public class Product {
	private Integer prodId;
	private String prodName;
	private String prodPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer prodId, String prodName, String prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "[{prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]}";
	}
	
}
