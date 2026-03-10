/*Practical 3.1 : Create a Java class named University with a static data member totalStudents to keep
track of the number of student objects created. Implement a static method
getTotalStudents(). Also, include a static block to initialize a static variable (e.g.,
universityName) and an instance block to print a message when an object is created.
Demonstrate their execution order*/

import java.util.*;
public class University
{
	static int totalStudents;
	static String universityName;
	static
	{
		totalStudents = 0;
		universityName = "Gujarat Technological University";
		System.out.print("\nNumber of student and university name initialized.");
	}
	{
		System.out.print("\nNew University object created(New student enrolled).");
	}
	University()
	{
		totalStudents++;
		System.out.print("\nConstructor is executed.");
	}
	static int getTotalStudents()
	{
		return totalStudents;
	}
	public static void main(String[]args)
	{
		University student1 = new University();
		University student2 = new University();
		University student3 = new University();
		System.out.print("\nTotal number of students : " + getTotalStudents());		
	}
}