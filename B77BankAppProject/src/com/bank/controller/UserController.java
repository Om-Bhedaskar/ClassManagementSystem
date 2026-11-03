package com.bank.controller;

import java.util.Scanner;

import com.bank.service.Rbi;
import com.bank.serviceImpl.Sbi;

public class UserController {

	public static void main(String[] args) {

		Rbi rbi = new Sbi();
		Scanner sc = new Scanner(System.in);

		System.out.println("------------ Bank Application Opened ------------");
		boolean flag = true;

		while (flag) {
			System.out.println("\n----------- MENU -----------");
			System.out.println("1. Create Account");
			System.out.println("2. Display Account Details");
			System.out.println("3. Check Balance");
			System.out.println("4. Deposit Amount");
			System.out.println("5. Withdraw Amount");
			System.out.println("6. Update Profile Details");
			System.out.println("7. Exit");

			System.out.println("\nEnter Your Choice :");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				rbi.createAccount();
				break;

			case 2:
				rbi.displayAccount();
				break;
			case 3:
				rbi.displaybalance();
				break;
			case 4:
				rbi.depositeMoney();
				break;
			case 5:
				rbi.WithdrawAmount();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				flag = false;
				System.out.println("------------ Bank Application Closed ------------");
				break;
			default:
				System.out.println("Invalide Inpute...!");
				break;
			}
		}

	}
}
