package com.Exceptions;

import java.util.Scanner;

import com.customException.InvalideAgeException;

public class Example {

	void m1() throws InvalideAgeException {
		System.out.println("Enter your Age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Voter is aligible for voting..");
		} else {
			throw new InvalideAgeException("Invalide Age ! Please Enter Valide Age ..!");
		}

	}

	public static void main(String[] args) {

		Example e = new Example();
		try {
			e.m1();
		} catch (InvalideAgeException i) {
//			i.printStackTrace();
//			System.err.println(i.getMessage());
				System.out.println(i.getLocalizedMessage());
		}
	}
}
