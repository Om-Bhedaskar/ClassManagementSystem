package com.bank.model;

public class Account {

	private String firstName;
	private String lastName;
	private double balance;
	private long accountNo;
	private String email;
	private String panNumber;
	private long mobileNumber;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
	    return "------ Account Details ------"
	         + "\nFirst Name    : " + firstName
	         + "\nLast Name     : " + lastName
	         + "\nBalance       : " + balance
	         + "\nAccount No    : " + accountNo
	         + "\nEmail         : " + email
	         + "\nPAN Number    : " + panNumber
	         + "\nMobile Number : " + mobileNumber;
	}
	
	
	

}
