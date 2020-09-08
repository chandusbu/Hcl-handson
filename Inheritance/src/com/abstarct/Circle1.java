
	package com.abstarct;
import java.util.*;
@SuppressWarnings("unused")
public class Circle1 extends Shape1
{
float radius;
	@Override
	public Double calculatePerimeter(float radius) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Double perimeter=(Double) (2*3.14*radius);
		System.out.println("perimeter is:"+perimeter);
		return perimeter;
	}
	@Override
	public Double calculatePerimeter() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}