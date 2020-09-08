package com.Hcl;

public class CurrentAccount extends Account {
	
		String tinNumber;

		public CurrentAccount()
		{
			
		}
		public CurrentAccount(String accName, String accNo, String bankName,String tinNumber) {
			super(accName,accNo,bankName);
			this.tinNumber=tinNumber;
		}
	public	void display()
		{
			System.out.println("accname:"+tinNumber);
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
		public void setTinNumber(String tinNumber) {
			this.tinNumber=tinNumber;
		}

		}


