/*Practical 2.1 : Define a Java class named Rectangle. It should have two double data fields: width and
height, both with a default value of 1. Implement a no-argument constructor and a
constructor that takes width and height as parameters. Include methods getArea() and
getPerimeter() that return the calculated area and perimeter respectively*/

import java.util.*;
public class Rectangle
{
	double height;
	double width;
	Rectangle()
	{
		height = 1;
		width = 1;
	}
	Rectangle(double h, double w)
	{
		height = h;
		width = w;
	}
	double getArea()
	{
		System.out.println("Area of rectangle : " + (height*width));
		return height*width;
	}
	double getPerimeter()
	{
		System.out.println("Perimeter of rectangle : " + (2*height + 2*width));
		return 2*(height + width);
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		double h,w;

		System.out.print("Enter height of the rectangle :");
		h = sc.nextDouble();
		System.out.print("Enter width of the rectangle :");
		w = sc.nextDouble();

		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(h,w);

		System.out.println("\nConstructor without arguments : ");
		rect1.getArea();
		rect1.getPerimeter();

		System.out.println("\nConstructor with arguments : ");
		rect2.getArea();
		rect2.getPerimeter();

		return;
	}
}