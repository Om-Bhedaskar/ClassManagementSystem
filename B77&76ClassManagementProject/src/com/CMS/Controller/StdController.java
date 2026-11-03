package com.CMS.Controller;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import com.CMS.Service.Service;
import com.CMS.serviceImple.ServiceImple;

public class StdController {

	public static void main(String[] args) {
		System.out.println("Welcome to G");
		Scanner sc = new Scanner(System.in);
		Service cms = new ServiceImple();
		boolean flag = true;

		while (flag) {
			System.out.println("\n1. Add Course");
			System.out.println("2. Display Course Details");
			System.out.println("3. Add Faculty");
			System.out.println("4. Display Faculty Details");
			System.out.println("5. Add Batch");
			System.out.println("6. Display Batch Details");
			System.out.println("7. Add Student");
			System.out.println("8 Display Student Details");
			System.out.println("9. Update Details");
			System.out.println("10.Delete Details");
			System.out.println("11. Exit");

			System.out.println("\nEnter Your choice : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				cms.addCourse();
				break;
			case 2:
				cms.displayCourseDetail();
				break;
			case 3:
				cms.addFaculty();
				break;
			case 4:
				cms.displayFacultyDetail();
				break;
			case 5:
				cms.addBatch();
				break;
			case 6:
				cms.displayBatchDetail();
				break;

			case 7:
				cms.addStudent();
				break;

			case 8:
				cms.displayStudentDetail();
				break;

			case 9:
				cms.updateDetails();
				break;

			case 10:
				cms.deleteDetails();
				break;

			case 11:
				flag = false;
				break;

			default:
				System.out.println("Invalide Inpute ! Please Enter Valide Inpute...!");
				break;
			}
		}
	}

}
