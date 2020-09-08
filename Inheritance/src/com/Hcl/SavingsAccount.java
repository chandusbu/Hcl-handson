package com.Hcl;

public class SavingsAccount extends Account{
	private static String tinNumber = null;
	String orgNumber;

	public SavingsAccount()
	{
		
	}
	public SavingsAccount(String accName, String accNo, String bankName,String orgNumber) {
		super(accName,accNo,bankName);
		this.orgNumber=orgNumber;
	}
	
	public void display()
	{
		System.out.println("accname:"+orgNumber);
		super.display();
		
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getTinNumber() {
		return tinNumber;
	}
	@SuppressWarnings("static-access")
	public void setTinNumber(String tinNumber) {
		this.tinNumber=tinNumber;
	}
	public String getorgNumber() {
		return orgNumber;
	}
	public void setorgNumber(String orgNumber) {
		this.orgNumber=orgNumber;
	}
	


}
