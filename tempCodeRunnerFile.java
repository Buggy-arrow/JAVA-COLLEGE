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
        System.out.print("\nEnter your age = ");
        int age = sc.nextInt();
        try
        {
            va.checkEligibility(age);
        }
        catch(InputMismatchException e)
        {
            System.out.print("\nInvalid Input.");
        }
        finally
        {
            System.out.print("\nValidation process completed");
        }
    }
}