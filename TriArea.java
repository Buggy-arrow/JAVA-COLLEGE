/*Practical 1.7 : Write a program that takes the lengths of three sides of a triangle as input. Calculate and 
print the area of the triangle. Ensure that the program validates if the given side lengths can 
actually form a triangle (sum of any two sides must be greater than the third side) before 
calculating the area (use Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = 
(a+b+c)/2). */

import java.util.*;
public class TriArea
{
	public static void main(String[]args)
	{	
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter side A of triangle : ");
		a = sc.nextFloat();
		
		System.out.print("\nEnter side B of triangle : ");
		b = sc.nextFloat();
		
		System.out.print("\nEnter side C of triangle : ");
		c = sc.nextFloat();
		if(a+b <= c || b+c <= a || a+c <= b)
		{
			System.out.print("Your triangle is invalid.");
			return;
		}
		float s = ((a+b+c)/2);
		float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("\nArea of your triangle is : " + area);
	}
}