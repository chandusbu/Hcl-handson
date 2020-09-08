package com.Hcl1;

public class Account1 {
	
	 String accountNumber;
	Double balance;	
static String	accountHolderName;	
public Account1()
{
	
}
public Account1(String accountNumber, Double balance, String accountHolderName) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
	Account1.accountHolderName = accountHolderName;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
@SuppressWarnings("static-access")
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

}
