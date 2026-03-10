/*Practical 3.2 :  Write a Java program to model a college admission system using the concept of inner
classes. Create an outer class named College that stores the collegeName as a data
member and initializes it through a constructor. Within the College class, define a non
static inner class named Admission that contains student-specific details such as the
studentName and the course they are enrolling in. The inner class should have methods
to accept and display student information, and it should also be able to access and display
the collegeName stored in the outer class. In the main method, create an object of the
College class by passing the collegeName, and then use this object to create an instance
of the inner Admission class. Invoke appropriate methods to input the student’s name and
course, and then display the complete admission details, including the college name.*/

import java.util.*;
public class College
{
	String collegeName;
	College(String name)
	{
		collegeName = name;
	}
	public class Admission
	{	
		Scanner sc = new Scanner(System.in);
		String studentName;
		String course;
		void getStdDetails()
		{
			System.out.print("Enter name of the Student : ");
			studentName = sc.nextLine();

			System.out.print("Enter course of the student : ");
			course = sc.nextLine();
		}

		void DisplayInfo()
		{	
			System.out.print("\nCollege of the Student : " + collegeName);
			System.out.print("\nName of the Student : " + studentName);
			System.out.print("\nCourse of the Student : " + course);
		}
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Enter name of the college : ");
		name = sc.nextLine();
		College cllg = new College(name);
		College.Admission student = cllg.new Admission();
		student.getStdDetails();
		student.DisplayInfo();
		return;
	}
}
