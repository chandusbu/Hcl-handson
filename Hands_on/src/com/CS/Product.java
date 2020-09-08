
package com.CS;

public class Product {
	
 static final String s = null;
	int product_code ;
	String product_name;
	double Price;
	int Stock;
	
	public Product(int product_code, String product_name, double Price, int Stock) {
		
		this.product_code = product_code;
		this.product_name = product_name;
		this.Price=Price;
		this.Stock=Stock;
		
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	Void check()
	{
		if(p.Price>s.Price)
			System.out.println("p.Price is greater than s.Price");
		else
			System.out.println("p.Price is lesser than s.Price");
	}
	
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	
	

}
