/*Practical 1.4 :  Develop a Java application that calculates a person's Body Mass Index (BMI). The
program should ask the user for their weight in pounds and height in inches. Convert
these values to kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch =
0.0254 meters) and then calculate BMI (weight in kg / (height in meters)^2). Display the
calculated BMI.*/

import java.util.*;
public class BodyMassIndex
{
	public static void main(String[]args)
	{
		float mass, height;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your weight(in pounds) : ");
		mass = sc.nextFloat();
		System.out.print("Enter your height(in inches) : ");
		height = sc.nextFloat();

		mass *= 0.45359237f;
		height *= 0.0254f;
		
		int BMI = (int)(mass/(height*height)); 
		System.out.print("\nYour Body mass index(BMI) = " + BMI);
		return;
	} 
}