package com.abstarct;
import java.util.*;


@SuppressWarnings("unused")
public class Rectangle1 extends Shape1
{
float length,breadth;
	@Override
	public Double calculatePerimeter(float length,float breadth) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Double perimeter= (double) (2*(length+breadth));
		System.out.println("perimeter is:"+perimeter);
		return perimeter;
	}
	@Override
	public Double calculatePerimeter() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
