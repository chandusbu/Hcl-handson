package com.abstarct;

import java.util.Scanner;
import java.util.*;

public class Main5 {

	private static int menu;
	@SuppressWarnings("unused")
	private static float radius;
	@SuppressWarnings("unused")
	private static float length;
	@SuppressWarnings("unused")
	private static float breadth;
	@SuppressWarnings("unused")
	private static float side;
	private static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Shape1 s=new Circle1();
s.calculatePerimeter();
Shape1 s2=new Rectangle1();
s2.calculatePerimeter();
Shape1 s1=new Square();
s1.calculatePerimeter();
do
{
	System.out.println("List of Shapes: ");
	System.out.println("1.Circle");
	System.out.println("2.Rectangle");
	System.out.println("3.Square");
	System.out.println("Enter your choice:");
	menu=sc.nextInt();
	switch(menu)
	{
	case 1:
		System.out.println("Enter the radius of the Circle:");
		radius=(float)sc.nextDouble();
		s.calculatePerimeter(radius);
		break; 
	case 2:
		System.out.println("Enter the length of the Rectangle:");
				length=sc.nextFloat();
				System.out.println("Enter the breadth of the Rectangle:");
				breadth=sc.nextFloat();
				s2.calculatePerimeter(length,breadth);		
				break;
	case 3:
		System.out.println("Enter the side of the Square");
		side=sc.nextFloat();
		s1.calculatePerimeter(side);
		break;
		default:
			System.out.println("Exit");
	}
}while(n<=2);
	}

}
