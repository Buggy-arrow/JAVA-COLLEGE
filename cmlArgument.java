/*Practical 1.5 :  Write a Java program that accepts two numbers as command-line arguments. Convert
these arguments to appropriate numeric types (e.g., int or double), perform a simple
calculation (e.g., sum or product), and print the result to the console.*/

public class cmlArgument
{
	public static void main(String[]args)
	{
		int sum = 0,product = 1;
		for(int i = 0;i < args.length;i++)
		{
			sum += Integer.parseInt(args[i]);
			product *= Integer.parseInt(args[i]);
		}
		System.out.println("\nSum = " + sum);
		System.out.println("Product = " + product);
		return;
	}
}