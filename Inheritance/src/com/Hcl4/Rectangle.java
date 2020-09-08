package com.Hcl4;


class Rectangle extends Shape {
	Double length,breadth;
	   Rectangle(double length, double breadth) {
	      super();
	   }
	   public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	Double computearea() {
	     
	      return(length*breadth);
	   }
	}