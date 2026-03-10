/*Practical 2.4 :  Write a program for billing system for a shopping mall. Create a class BillGenerator that
uses method overloading to generate bills based on customer type:
generateBill(int itemTotal): For regular customers, apply no discount.
generateBill(int itemTotal, int discount): For privileged customers, apply flat discount in
rupees.
generateBill(int itemTotal, double discountPercent): For festive offers, apply percentage
discount.
Write a program to display the final bill amount using appropriate overloaded method
based on customer category.*/

import java.util.*;
public class BillGenerator
{
	int generateBill(int itemTotal)
	{
		System.out.print("\nTotal bill : " + itemTotal);
		return itemTotal;
	}
	int generateBill(int itemTotal, int discount)
	{
		System.out.print("\nTotal bill with flat discount in INR : " + (itemTotal - discount));
		return itemTotal - discount;
	}
	double generateBill(int itemTotal, double discountPercent)
	{
		System.out.print("\nTotal bill with percentage discount for festive offers : " + (itemTotal*(100 - discountPercent)/100));
		return (itemTotal*(100 - discountPercent)/100);
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		BillGenerator BG = new BillGenerator();
		int itemTotal, discount;
		double discountPercent;
		
		System.out.print("Enter total bill : ");
		itemTotal = sc.nextInt();

		System.out.print("Enter discount in INR : ");
		discount = sc.nextInt();

		System.out.print("Enter discount in percentage for festive offers : ");
		discountPercent = sc.nextDouble();

		BG.generateBill(itemTotal);
		BG.generateBill(itemTotal,discount);
		BG.generateBill(itemTotal,discountPercent);
	}
}
