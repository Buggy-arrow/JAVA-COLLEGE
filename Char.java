/*Practical 1.3 : Write a Java program that prompts the user to enter a single letter (character). Determine
whether the entered character is a vowel (a, e, i, o, u, case-insensitive) or a consonant,
and display the result*/

import java.util.*;
public class Char
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("Enter a character : ");
		ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
		{
			System.out.println("Your character is a vowel.");
		}
		else
		{
			System.out.println("Your character is consonant.");
		}
		return;
	}	
}