package com.Hcl1;

public class FixedAccount extends SavingAccount1 {
	 private static Double balance;
	int lockingPeriod;
	
public FixedAccount(int lockingPeriod) {
	super(accountHolderName, balance, minimumBalance);
	  this.lockingPeriod=lockingPeriod;
	}



public FixedAccount(java.lang.String string, double d, java.lang.String string2, int i, int j) {
	// TODO Auto-generated constructor stub
}



public FixedAccount() {
	// TODO Auto-generated constructor stub
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
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public Double getMinimumBalance() {
	return minimumBalance;
}

public void setMinimumBalance(Double minimumBalance) {
	this.minimumBalance = minimumBalance;
}




}