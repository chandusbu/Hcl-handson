package com.Hcl;
import java.util.Scanner;


public class Main {
	static String	accName;	
static	String accNo;	
	static String bankName;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu,n = 0;
		Scanner sc=new Scanner(System.in);
		Account a=new Account();
		
		
	//	CurrentAccount c=new CurrentAccount("krish","131231451","ICICI","798902");
		
		//SavingsAccount s=new SavingsAccount("Morsh","03380802","Baroda","Amphisoft");
		
		do {
		System.out.println("Choose Account Type:");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		System.out.println("type 1 or 2");
		menu=sc.nextInt();
		switch(menu)
		{
		case 1:
		
		        System.out.println("Enter Account details" );
		        SavingsAccount s=new SavingsAccount("Morsh","03380802","Baroda","Amphisoft");
				
		      
		        System.out.println("Account Name:"+s.getAccName());
				System.out.println("Account Number:"+s.getAccNo());
				System.out.println("Bank Name:"+s.getBankName());
				System.out.println("Org Number:"+s.getorgNumber());
				
				
		break;
		case 2:
			 System.out.println("Enter Account details" );
			 CurrentAccount c=new CurrentAccount("krish","131231451","ICICI","798902");
			
		        System.out.println("Account Name:"+c.getAccName());
				System.out.println("Account Number:"+c.getAccNo());
				System.out.println("Bank Name:"+c.getBankName());
				System.out.println("Tin Number:"+c.getTinNumber());
				
				break;
				default:
					System.out.println("exit");
				
				

	}
	}while(n<=2);
}
}
