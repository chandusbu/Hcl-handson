package com.Hcl4;
import java.util.Scanner;

public class Main4 {

	private static int menu;
	private static double radius;
	private static double length;
	private static double breadth;
	private static double base;
	private static double height;
	private static int n1;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
Shape s= new Circle();
Shape s1= new Rectangle();
Shape s2=new Triangle();

Rectangle r=new Rectangle(length,breadth);
Triangle t=new Triangle(base,height);

do {
	
System.out.println("Enter the shape:");
System.out.println("1.circle");
System.out.println("2.Rectangle");
System.out.println("3.Triangle");
menu=sc.nextInt();

switch(menu) {
	case 1:
		
		System.out.println("Enter the radius:");
		radius=sc.nextDouble();
		System.out.println("area:"+3.14*radius*radius);
		break;
		
		
	case 2:
		
		System.out.println("Enter the length:");
		breadth=sc.nextDouble();
		System.out.println("Enter the breadth");
		length=sc.nextDouble();
		System.out.println("area:"+length*breadth);
		break;
		
	case 3:
		//base=sc.nextDouble();
		System.out.println("enter the base:");
		base=sc.nextDouble();
		System.out.println("enter the height:");
		height=sc.nextDouble();
		System.out.println("area:"+0.5*base*height);
		break;
	case 4:
		System.out.println("Invalid choice");
		default:
			System.out.println("Exit");
				
}

	}while(n1<=2);

}

	}

