package com.bank.serviceImpl;

import java.util.Scanner;

import com.bank.ValidationChecker.Validation;
import com.bank.model.Account;
import com.bank.service.Rbi;
import com.customException.InvalidePanNumberException;


public class Sbi implements Rbi {

	Scanner sc = new Scanner(System.in);

	Account[] accounts = new Account[5];

	@Override
	public void createAccount() {

		System.out.println("---------Account Creation Is Started---------");

		System.out.println("enter a number you want to create a ac..!");
		int size = sc.nextInt(); // 5
		for (int i = 0; i < size; i++) {

			Account account = new Account();

//		System.out.println("Enter your first name :");
			String firstName = Validation.checkName();
			account.setFirstName(firstName);

			System.out.println("Enter your last name :");
			String lastName = sc.next();
			account.setLastName(lastName);

			System.out.println("Enter your account balance :");
			double acBalance = sc.nextDouble();
			account.setBalance(acBalance);

//		System.out.println("Enter your account Number :");
			long acNumber = Validation.generateAcNumber();
			account.setAccountNo(acNumber);

			System.out.println("Enter your Email Id :");
			String emailId = sc.next();
			account.setEmail(emailId);

			
			try {
				String panNumber = Validation.panValidation();
				account.setPanNumber(panNumber);

			} catch (InvalidePanNumberException e) {
				System.out.println(e.getMessage());
			}
			
			long mobileNumber = Validation.mobileNumber();
			account.setMobileNumber(mobileNumber);

			System.out.println("Your Account number is : " + acNumber);

			accounts[i] = account;

		}

		System.out.println("---------Account Creation Is Complete---------\n");
	}

	@Override
	public void displayAccount() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println(accounts[i]);
			}
		}
	}

	@Override
	public void displaybalance() {
//		System.out.println("Hello Welcome To SBI Bank Your Current Balance Is : " + account.getBalance() + "\n");

	}

	@Override
	public void depositeMoney() {

	}

	@Override
	public void WithdrawAmount() {

	}

	@Override
	public void updateAccountDetails() {

	}

}
