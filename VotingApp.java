/*Practical 6.2 :  Write a Java program to create a class VotingApp where:
The method checkEligibility(int age) checks if a person is eligible to vote.
If age < 18, explicitly throw the predefined exception IllegalArgumentException with the
message "Age must be 18 or above to vote".
In the main method, test the method with different age inputs.
Use a try-catch-finally block to handle exceptions.
The finally block should always print "Validation process completed"*/
import java.util.*;
class VotingApp
{
    void checkEligibility(int age)
    {
        if(age < 18)
        {
            throw new IllegalArgumentException("Age must be 18 or above to vote.");
        }
        else
        {
            System.out.print("\nYou are eligible.");
        }
        return;
    }
    public static void main(String[] args)
    {
        VotingApp va = new VotingApp();
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("\nEnter your age = ");
            int age = sc.nextInt();
            va.checkEligibility(age);
        }
        catch(InputMismatchException e)
        {
            System.out.print("\nInvalid Input.");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.print("\nValidation process completed");
        }
    }
}