package com.CS;
import java.util.*;

@SuppressWarnings("unused")
public class Sample1 {

	
	//public static Product p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int product_code ;
				String product_name;
				double Price;
				int Stock;
				Scanner sc=new Scanner(System.in);
				Product a=new Product(1,"tv",50000.0,10);
				Product c=new Product(2,"mobile",20000.0,20);
				product_code=sc.nextInt();
				System.out.println("Product_code:"+a.getProduct_code());
				System.out.println("Product_code:"+c.getProduct_code());
				product_name=sc.nextLine();
				System.out.println("Product_code:"+a.getProduct_name());
				System.out.println("Product_code:"+c.getProduct_name());
				Price=sc.nextDouble();
		        System.out.println("Price:"+a.getPrice());
			    System.out.println("Price:"+c.getPrice());
				Stock=sc.nextInt();
				System.out.println("Stock:"+a.getStock());
				System.out.println("Stock:"+c.getStock());
				
				
				
				
				
	
	
				
				
			    
				
		        
				
						
				
			

	}

}
