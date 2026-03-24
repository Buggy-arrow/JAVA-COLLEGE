/*Practical 1.2 :  Write a Java program to solve a system of two linear equations with two variables (e.g.,
ax + by = e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f.
Calculate and display the values of x and y using Cramer's rule. Include error handling
for cases where the denominator is zero.
Cramer's rule :
D = ad − bc
Dx = ed − bf
Dy = af − ce
x = Dx / D
y = Dy / D*/

import java.util.*;
public class SolLinEquation
{
	public static void main(String[]args)
	{	
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;

		System.out.print("For equation 1 : ax + by = e\nEnter a : ");
		a = sc.nextInt();
		System.out.print("\nEnter b : ");
		b = sc.nextInt();
		System.out.print("\nEnter e : ");
		e = sc.nextInt();

		System.out.print("For equation 2 : cx + dy = f\nEnter c : ");
		c = sc.nextInt();
		System.out.print("\nEnter d : ");
		d = sc.nextInt();
		System.out.print("\nEnter f : ");
		f = sc.nextInt();
		
		int D = (a*d)-(b*c);
		if(D == 0)
		{
			System.out.println("No unique solution (D = 0)");
			return;
		}

		int Dx = (e*d)-(b*f);
		int Dy = (a*f)-(e*c);

		float x = (float)Dx/D;
		float y = (float)Dy/D;
		
		System.out.printf("Solution : \nx : %.2f\ny : %.2f",x,y);

	}
}