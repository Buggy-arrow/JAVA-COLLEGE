/*Practical 2.3 :  Create a Point class representing a 2D point (x, y). Implement a default constructor that
initializes both x and y to 5. Provide a parameterized constructor to initialize x and y
with user-supplied values. Also, implement a copy constructor to create a new Point
object as a copy of an existing Point object. Include a display() method to show the
point's coordinates and write a main method to test all constructors and the display
functionality.*/

import java.util.*;
public class Point
{
	float x,y;
	Point()
	{
		x = 5;
		y = 5;
	}
	Point(float a, float b)
	{
		x = a;
		y = b;
	}
	Point(Point p)
	{
		x = p.x;
		y = p.y;
	}
	void display()
	{
		System.out.print("\nX coordinate : " + x);
		System.out.print("\nY coordinate : " + y);
		return;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Point p1 = new Point();
		float a,b;
		System.out.print("\nEnter X coordinate : ");
		a = sc.nextFloat();
		System.out.print("Enter Y coordinate : ");
		b = sc.nextFloat();
		Point p2 = new Point(a,b);
		Point p3 = p2;

		System.out.print("\nCoordinates of non argument constructor : ");
		p1.display();
		System.out.print("\nCoordinates of argument constructor : ");
		p2.display();
		System.out.print("\nCoordinates of copy constructor : ");
		p3.display();
		return;
	}
}