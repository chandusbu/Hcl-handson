package com.cs2;
import java.util.*;
import java.util.*;



public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				int n;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number of wickets");
				n=sc.nextInt();
				Wicket arr[]=new Wicket[n];
				int counter=0;
				for(int i=0;i<n;i++)
				{
					if(counter==0)
					{
					System.out.println("Enter the details of wicket "+(counter++));
					sc.nextLine();
					}
					else
						{System.out.println("Enter the details of wicket "+(counter++));}
					
					String a=sc.nextLine();
					String b[]=a.split(",");
					arr[i]=new Wicket(Long.parseLong(b[0]),Long.parseLong(b[1]),b[2],b[3],b[4]);
					
				}
				
				System.out.println("Wicket details ");
				for(Wicket i:arr)
				{
					System.out.println("Over : "+i.getOver());
					System.out.println("Ball : "+i.getBall());
					System.out.println("Wicket Type : "+i.getWicketType());
					System.out.println("Player Name : "+i.getPlayerName());
					System.out.println("Bowler Name : "+i.getBowlerName());	
					
				}

			}
			

		
	}


