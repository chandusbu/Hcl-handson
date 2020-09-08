package com.Hcl1;
import java.util.Scanner;




public class Main1 {

	



	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("Product Details:");
System.out.println("Enter accountDetails:");





String strMain = "ACC001,5456.45,TonyBlake,500,10";
 String[] array = strMain.split(",");

for (int i=0; i < array.length; i++)
{
  System.out.println(array[i]);
  //System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period")

}
Account1 a=new Account1();
SavingAccount1 s=new SavingAccount1("ACC001",5456.45,"TonyBlake",(double) 500);
System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
//System.out.println("s.getaccountNumber()+/t+s.gebalance()+s.getaccountHolderName()+s.getminimumBalance()");

FixedAccount f=new FixedAccount();


	}

}
