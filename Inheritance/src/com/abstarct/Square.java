package com.abstarct;
import java.util.*;
@SuppressWarnings("unused")


public class Square extends Shape1
{
float side;
	@Override
	public Double calculatePerimeter(float side) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Double peri=(double) (4*side);
		System.out.println("perimeter is:"+peri);
		return peri;
	}
	@Override
	public Double calculatePerimeter() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}