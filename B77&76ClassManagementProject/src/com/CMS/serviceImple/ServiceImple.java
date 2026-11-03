package com.CMS.serviceImple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.CMS.Model.*;
import com.CMS.Service.Service;

public class ServiceImple implements Service {

	Scanner sc = new Scanner(System.in);

	List<Course> course = new ArrayList<Course>();
	List<Faculty> faculty = new ArrayList<Faculty>();
	List<Batch> batch = new ArrayList<Batch>();
	List<Student> student = new ArrayList<Student>();

	@Override
	public void addCourse() {
		Course c = new Course();

		System.out.println("Enter Course Id  :");
		c.setCourseId(sc.nextInt());
		System.out.println("Enter Course Name : ");
		c.setCourseName(sc.next());

		course.add(c);

	}

	@Override
	public void displayCourseDetail() {
		for (Course c : course) {
			System.out.println(c);
		}
	}

	@Override
	public void addFaculty() {
		Faculty f = new Faculty();

		System.out.println("Enter Faculty Id  :");
		f.setFacultyId(sc.nextInt());
		System.out.println("Enter Faculty Name : ");
		f.setFacultyName(sc.next());

		System.out.println("Enter Course Id ");
		int cId = sc.nextInt(); // 102

		for (Course c : course) {
			if (c.getCourseId() == cId) {
				f.setCourse(c);
			}
		}

		faculty.add(f);

	}

	@Override
	public void displayFacultyDetail() {

		for (Faculty f : faculty) {
			System.out.println("Faculty Id : " + f.getFacultyId());
			System.out.println("Faculty Name : " + f.getFacultyName());
			if (f.getCourse() != null) {
				System.out.println("Course Id :" + f.getCourse().getCourseId());
				System.out.println("Courese Name : " + f.getCourse().getCourseName()+"\n");
			} else {
				System.out.println("Course : Not Assigned");
			}
		}

	}

	@Override
	public void addBatch() {
		Batch b = new Batch();

		System.out.println("Enter Batch Id  :");
		b.setBatchId(sc.nextInt());
		System.out.println("Enter Batch Name : ");
		b.setBatchName(sc.next());

		System.out.println("Enter Faculty Id ");
		int fId = sc.nextInt();

		for (Faculty f : faculty) {
			if (f.getFacultyId() == fId) {
				b.setFaculty(f);
			}
		}

		batch.add(b);

	}

	@Override
	public void displayBatchDetail() {
		for (Batch b : batch) {
			System.out.println("Batch Id : " + b.getBatchId());
			System.out.println("Batch Name : " + b.getBatchName());
			if (b.getFaculty() != null) {
				System.out.println("Faculty Id : " + b.getFaculty().getFacultyId());
				System.out.println("Faculty Name : " + b.getFaculty().getFacultyName());
				if (b.getFaculty().getCourse() != null) {
					System.out.println("Course Id : " + b.getFaculty().getCourse().getCourseId());
					System.out.println("Course Name : " + b.getFaculty().getCourse().getCourseName()+"\n");
				} else {
					System.out.println("Course Not Assigned !");
				}
			} else {
				System.out.println("Faculty Not Assigned !");
			}
		}

	}

	@Override
	public void addStudent() {
		Student s = new Student();
		System.out.println("Enter Student Id  :");
		s.setStudenytId(sc.nextInt());
		System.out.println("Enter Student Name : ");
		s.setStudentName(sc.next());

		System.out.println("Enter Batch Id ");
		int bId = sc.nextInt();

		for (Batch b : batch) {
			if (b.getBatchId() == bId) {
				s.setBatch(b);
			}
		}

		student.add(s);

	}

	@Override
	public void displayStudentDetail() {

		for (Student s : student) {
			System.out.println("Student Id : " + s.getStudenytId());
			System.out.println("Student Name : " + s.getStudentName());
			if (s.getBatch() != null) {
				System.out.println("Batch Id : " + s.getBatch().getBatchId());
				System.out.println("Batch Name : " + s.getBatch().getBatchName());
				if (s.getBatch().getFaculty() != null) {
					System.out.println("Faculty Id : " + s.getBatch().getFaculty().getFacultyId());
					System.out.println("Faculty Name : " + s.getBatch().getFaculty().getFacultyName());
					if (s.getBatch().getFaculty().getCourse() != null) {
						System.out.println("Course Id : " + s.getBatch().getFaculty().getCourse().getCourseId());
						System.out.println("Course Name : " + s.getBatch().getFaculty().getCourse().getCourseName()+"\n");
					} else {
						System.out.println("Course : Not Assigned");
					}
				} else {
					System.out.println("Faculty : Not Assigned");
				}
			} else {
				System.out.println("Batch : Not Assigned");
			}
		}

	}

	@Override
	public void updateDetails() {

		boolean found = false;
		boolean flag = true;
		while (flag) {
			System.out.println("1. Update Course");
			System.out.println("2. Update Faculty");
			System.out.println("3. Update Batch");
			System.out.println("4. Update Student");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Course Id to update : ");
				int cId = sc.nextInt();

				for (Course c : course) {
					if (c.getCourseId() == cId) {
						System.out.println("Enter New Course Name : ");
						c.setCourseName(sc.next());
						found = true;
						System.out.println("Course Updated Successfully...!");
					}
				}
				if (!found) {
					System.out.println("Course Not Found...!");
				}
				break;

			case 2:
				System.out.println("Enter Faculty Id to update : ");
				int fId = sc.nextInt();

				for (Faculty f : faculty) {
					if (f.getFacultyId() == fId) {
						System.out.println("Enter New Faculty Name : ");
						f.setFacultyName(sc.next());
						System.out.println("Enter New Course Id : ");
						int newCId = sc.nextInt();
						for (Course c : course) {
							if (c.getCourseId() == newCId) {
								f.setCourse(c);
							}
						}
						found = true;
						System.out.println("Faculty Updated Successfully...!");
					}
				}
				if (!found) {
					System.out.println("Faculty Not Found...!");
				}
				break;

			case 3:
				System.out.println("Enter Batch Id to update : ");
				int bId = sc.nextInt();

				for (Batch b : batch) {
					if (b.getBatchId() == bId) {
						System.out.println("Enter New Batch Name : ");
						b.setBatchName(sc.next());
						System.out.println("Enter New Faculty Id : ");
						int newFId = sc.nextInt();
						for (Faculty f : faculty) {
							if (f.getFacultyId() == newFId) {
								b.setFaculty(f);
							}
						}
						found = true;
						System.out.println("Batch Updated Successfully...!");
					}
				}
				if (!found) {
					System.out.println("Batch Not Found...!");
				}
				break;

			case 4:
				System.out.println("Enter Student Id to update : ");
				int sId = sc.nextInt();

				for (Student s : student) {
					if (s.getStudenytId() == sId) {
						System.out.println("Enter New Student Name : ");
						s.setStudentName(sc.next());
						System.out.println("Enter New Batch Id : ");
						int newBId = sc.nextInt();
						for (Batch b : batch) {
							if (b.getBatchId() == newBId) {
								s.setBatch(b);
							}
						}
						found = true;
						System.out.println("Student Updated Successfully...!");
					}
				}
				if (!found) {
					System.out.println("Student Not Found...!");
				}
				break;
			case 5:
				flag = false;
				break;

			default:
				System.out.println("Invalid Input ! Please Enter Valid Input...!");
				break;
			}

		}
	}

	@Override
	public void deleteDetails() {

		boolean found = false;
		boolean used = false;
		boolean flag = true;

		while (flag) {
			System.out.println("1. Delete Course");
			System.out.println("2. Delete Faculty");
			System.out.println("3. Delete Batch");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Course Id to delete : ");
				int cId = sc.nextInt();

				for (Course c : course) {
					if (c.getCourseId() == cId) {
						found = true;
						for (Faculty f : faculty) {
							if (f.getCourse() == c) {
								used = true;
							}
						}
						if (used) {
							System.out.println("Cannot Delete ! Course is assigned to a Faculty...!");
						} else {
							course.remove(c);
							System.out.println("Course Deleted Successfully...!");
						}
						break;
					}
				}
				if (found) {
					System.out.println("Course Not Found...!");
				}
				break;

			case 2:
				System.out.println("Enter Faculty Id to delete : ");
				int fId = sc.nextInt();

				for (Faculty f : faculty) {
					if (f.getFacultyId() == fId) {
						found = true;
						for (Batch b : batch) {
							if (b.getFaculty() == f) {
								used = true;
							}
						}
						if (used) {
							System.out.println("Cannot Delete ! Faculty is assigned to a Batch...!");
						} else {
							faculty.remove(f);
							System.out.println("Faculty Deleted Successfully...!");
						}
						break;
					}
				}
				if (found) {
					System.out.println("Faculty Not Found...!");
				}
				break;

			case 3:
				System.out.println("Enter Batch Id to delete : ");
				int bId = sc.nextInt();

				for (Batch b : batch) {
					if (b.getBatchId() == bId) {
						found = true;
						for (Student s : student) {
							if (s.getBatch() == b) {
								used = true;
							}
						}
						if (used) {
							System.out.println("Cannot Delete ! Batch has Students...!");
						} else {
							batch.remove(b);
							System.out.println("Batch Deleted Successfully...!");
						}
						break;
					}
				}
				if (found) {
					System.out.println("Batch Not Found...!");
				}
				break;

			case 4:
				System.out.println("Enter Student Id to delete : ");
				int sId = sc.nextInt();

				for (Student s : student) {
					if (s.getStudenytId() == sId) {
						found = true;
						student.remove(s);
						System.out.println("Student Deleted Successfully...!");
						break;
					}
				}
				if (found) {
					System.out.println("Student Not Found...!");
				}
				break;

			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invalid Input ! Please Enter Valid Input...!");
				break;
			}

		}

	}
}
