package annotationqualifier;

import org.springframework.stereotype.Component;


public class Order {
public Order(String itemname, Double price) {
		super();
		this.itemname = itemname;
		this.price = price;
	}
public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
private String itemname;
private Double price;
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public void display()
{
	System.out.println("itemname:"+itemname);
	System.out.println("Price:"+price);
}
}
