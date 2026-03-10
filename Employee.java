/*Practical 2.2 : Create an Employee class with private instance variables for employeeName (String) and
employeeSalary (double). Implement public methods readEmployeeData() (to take input
from the user) and displayEmployeeData() (to print the employee's name and salary).
Demonstrate object creation and method invocation in a main method*/

import java.util.*;
class Employee
{
	private String employeeName;
	private double employeeSalary;
	Scanner sc = new Scanner(System.in);
	public void readEmployeeData()
	{
		System.out.print("Enter name of the employee : ");
		employeeName = sc.nextLine();
		System.out.print("Enter salary of the employee : ");
		employeeSalary = sc.nextDouble();
		return;
	}
	
	public void displayEmployeeData()
	{
		System.out.print("\nName of the employee : " + employeeName);
		System.out.print("\nSalary of the employee : " + employeeSalary);
		return;
	}
	public static void main(String[]args)
	{
		Employee emp = new Employee();
		emp.readEmployeeData();
		emp.displayEmployeeData();
		return;
	}
}