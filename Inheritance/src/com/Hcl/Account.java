package com.Hcl;

public class Account {

String	accName;	
String accNo;	
String bankName;
public Account()
{
	
}
public Account(String accName, String accNo, String bankName) {
	super();
	this.accName = accName;
	this.accNo = accNo;
	this.bankName = bankName;
}
public void display( )
{
	System.out.println("accname:"+accName);
	System.out.println("accname:"+accNo);
	System.out.println("accname:"+bankName);
	
	
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


}
