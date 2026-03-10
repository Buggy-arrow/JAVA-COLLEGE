/*Practical 1.6 : Write a Java program that accepts a five-digit integer from the keyboard. Your program 
should then create a new number by adding one to each digit of the input number. For 
example, if the input is 12391, the output should be 23402 (note: 9+1=10, so it becomes 0 
with a carry) */

import java.util.*;
public class FiveDigit
{
	int reverse(int n)
	{
		int a = 0;
		while(n>0)
		{
			a = 10*a + (n%10);
			n /= 10;
		}
		return a;
	}
	public static void main(String[]args)
	{
		FiveDigit FD = new FiveDigit();
		int num, n = 10000, a, i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 5 digit number : ");
		num = sc.nextInt();
		if(num < 10000 || num > 99999)
		{
			System.out.print("Your number is not a 5 digit number.");
			return;
		}
		while(num > 0)
		{
			a = num%10;
			if(a == 9)
			{
				i = i*10;
			}
			else
			{
				i = i*10 + (a + 1);
			}
			num /= 10;
		}
		System.out.print("Your increamented 5 digit number : " + FD.reverse(i));
	}
}