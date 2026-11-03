package com.bank.ValidationChecker;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.customException.InvalidePanNumberException;

public class Validation {

	public static long generateAcNumber() {

		long acNumber = (long) (Math.random() * Math.pow(10, 12));
		return acNumber;
	}

	public static String checkName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first Name : ");// hari7788
		String fName = sc.next();

		if (fName.matches("[A-Za-z ]+")) {
			return fName;
		} else {
			System.out.println("------- Invalide Name -----------");
			return checkName();
		}
	}

	public static String panValidation() throws InvalidePanNumberException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pan number : ");// hari7788
		String panNumber = sc.next();
		boolean flag = false;

		if (panNumber.matches("[A-Z]{5}[1-9]{4}[A-Z]{1}")) {
			return panNumber;
		} else {
			
			throw new InvalidePanNumberException("Invalide Pan Number ! Please enter Valide pan number ...!");
//			System.out.println();
//			return  panValidation();
		}

	}

	public static long mobileNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Mobile number : ");
		long mobileNumber = sc.nextLong();
		String moNumber = String.valueOf(mobileNumber);

		if (Pattern.matches("[6-9]{1}[0-9]{9}", moNumber)) {
			return mobileNumber;
		} else {
			System.out.println("------- Invalide Mobile NUMBER -----------");
			return mobileNumber();
		}
	}

	// Validates email format using regex.
	public static String emailValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email ID : ");
		String email = sc.nextLine();

		if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
			return email;
		} else {
			System.out.println("Invalid Email Address...!");
			System.out.println("------------------------------------");
			return emailValidation();
		}
	}

}
