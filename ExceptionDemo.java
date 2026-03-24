/*Practical 6.1 : Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error.
 */

class ExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);
            double res = num/den;
            System.out.print("Result = " + res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Provide two arguments");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: Enter valid integers");
        }
    }
}