package com.Hcl1;

public class SavingAccount1  extends Account1 {
	@SuppressWarnings("unused")
	private static final String String = null;
	static Double minimumBalance;	
	
	@SuppressWarnings("static-access")
	public  SavingAccount1(String accountNumber, Double balance, String accountHolderName,Double minimumBalance)	
 {
	 super(accountNumber, balance, accountHolderName);
			
		this.minimumBalance=minimumBalance;
	}
	
	

	



	public SavingAccount1() {
		// TODO Auto-generated constructor stub
	}







	public SavingAccount1(java.lang.String accountHolderName, Double balance, Double minimumBalance2) {
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
	@SuppressWarnings("static-access")
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Double getMinimumBalance() {
		return minimumBalance;
	}

	@SuppressWarnings("static-access")
	public void setMinimumBalance(Double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

		

}
