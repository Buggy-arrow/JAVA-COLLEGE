/*Practical 1.8 (1.5 in GTU) : Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787), 
calculate and display the minimum number of currency notes of denominations 100, 50, 10, 
5, 2, and 1 that would be given to the user. */

import java.util.*;
public class ATM
{
	public static void main(String[]args)
	{
		int amt,a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount : ");
		amt = sc.nextInt();
		while(amt > 0)
		{
			if(amt >= 100)
			{
				a = amt/100;
				System.out.print("\nNumber of 100 INR note(s) : " + a);
				amt %= 100;
			}
			else if(amt >= 50)
			{
				a = amt/50;
				System.out.print("\nNumber of 50 INR note(s) : " + a);
				amt %= 50;
			}
			else if(amt >= 10)
			{
				a = amt/10;
				System.out.print("\nNumber of 10 INR note(s) or coin(s) : " + a);
				amt %= 10;
			}
			else if(amt >= 5)
			{
				a = amt/5;
				System.out.print("\nNumber of 5 INR coin(s) : " + a);
				amt %= 5;
			}
			else if(amt >= 2)
			{
				a = amt/2;
				System.out.print("\nNumber of 2 INR coin(s) : " + a);
				amt %= 2;
			}
			else if(amt >= 1)
			{
				a = amt/1;
				System.out.print("\nNumber of 1 INR coin(s) : " + a);
				amt %= 1;
			}
			else
			{
				System.out.print("\nDone");
				return;
			}
		}
	}
}