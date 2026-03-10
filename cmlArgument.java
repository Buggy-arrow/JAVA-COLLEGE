/*Practical 1.5 :  Write a Java program that accepts two numbers as command-line arguments. Convert
these arguments to appropriate numeric types (e.g., int or double), perform a simple
calculation (e.g., sum or product), and print the result to the console.*/

public class cmlArgument
{
	public static void main(String[]args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("\nSum = " + (a + b));
		System.out.println("Product = " + (a * b));
		return;
	}
}