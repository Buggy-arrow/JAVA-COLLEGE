/*Practical 1.1 : Develop a Java program that prompts the user to enter a distance in meters. Your
program should then convert this distance to feet (1 meter = 3.28084 feet) and display the
result formatted to two decimal places.*/

import java.util.*;
public class DistanceConvert
{
	float ConvertToFeet(float n)
	{
		return n*3.28084f;
	}
	public static void main(String[]args)
	{
		DistanceConvert MtoF = new DistanceConvert();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a distance in meters : ");
		float Dm = sc.nextFloat();
		System.out.printf("\nYour Distance in feet : %.2f",MtoF.ConvertToFeet(Dm));
	}
}

