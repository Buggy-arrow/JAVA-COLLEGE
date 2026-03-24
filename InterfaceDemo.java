import java.util.Scanner;

interface Exam{
    boolean isPassed(int mark);
}
interface Classify{
    String getDivision(double average);
}
class Result implements Exam,Classify{
    public boolean isPassed(int mark){
        return mark>=40;
    }
    public String getDivision(double average){
        if(average>=60)
            return "First Division";
        else if(average>=50)
            return "Second Division";
        else if(average>=40)
            return "Third Division";
        else
            return "Fail";
    }
}
public class InterfaceDemo{
    public static void main(String args[]){

        System.out.println("\n\nEnrollment No.: 240410107167\nName : Shah Purva Pankit");

        Scanner sc=new Scanner(System.in);
        Result r=new Result();

        System.out.print("Enter Marks:");
        int mark=sc.nextInt();

        System.out.print("Enter Average:");
        double avg=sc.nextDouble();

        System.out.println("Passed: "+r.isPassed(mark));
        System.out.println("Division: "+r.getDivision(avg));
    }
}
