package com.cs;

public class Service implements Car {

	private int years;

	@Override
	
	public void sum()
	    { 
		int n = 0;
		 int rev = 0; 
	        while (n != 0) { 
	            rev = (rev * 10) + (n % 10); 
	            n /= 10; 
	        }
	        int Odd = 0, Even = 0, c = 1; 
	  
	        while (n != 0) { 
	  
	            // If c is even number then it means 
	            // digit extracted is at even place 
	            if (c % 2 == 0) 
	                Even += n % 10; 
	            else
	                Odd += n % 10; 
	            n /= 10; 
	            c++; 
	        } 
	        if(n==Odd)

	        System.out.println("you can go for servicing on Monday, Wednesday and Friday. ");
	        else if(n==Even)
	        	System.out.println("you can go on Tuesday, Thursday and Saturday");
	        }    	


	@Override
	public void years() {
		// TODO Auto-generated method stub
		if(years<5)
		System.out.println("car washing is free for you");
	}

	@SuppressWarnings("unused")
	@Override
	public void brand() {
		// TODO Auto-generated method stub
	
		String brand = null;
		if(brand=="maruti")
			System.out.println("you got 5% off in service charge");
		System.out.println("Your servicing charges are:" +4750);
				
		
	}

	
	        
	
}
