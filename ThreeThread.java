/*Practical 7.2 : Write a Java program where Thread T1 prints 1 to 100, T2 prints 101 to 200 and T3
prints 201 to 300. Initiate execution of all the three threads but ensure that numbers
should be printed sequentially.*/
import java.util.*;
class ThreeThread implements Runnable
{
    int low,high, interval;
    ThreeThread(int l,int h)
    {
        low = l;
        high = h;
    }
    public void run()
    {
        for(int i = low;i <= high;i++)
        {
            System.out.print((i) + "\t");
        }
    }
    public static void main(String[] args)
    {
        ThreeThread task1 = new ThreeThread(1,100);
        ThreeThread task2 = new ThreeThread(101,200);
        ThreeThread task3 = new ThreeThread(201,300);
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
        try
        {
            t1.start();
            t1.join();  

            t2.start();
            t2.join();   

            t3.start();
            t3.join();   
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}