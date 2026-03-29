/*Practical 7.1 :  Write a Java program that creates two threads:
First thread prints numbers from 1 to 10 at the interval of 1 second.
Second thread prints numbers from 11 to 20 at the interval of 500 ms. Run both threads
and display the output. */
import java.util.*;
class TwoThread implements Runnable
{
    int low,high, interval;
    TwoThread(int l,int h,int i)
    {
        low = l;
        high = h;
        interval = i;
    }
    public void run()
    {
        for(int i = low;i <= high;i++)
        {
            System.out.print("\t"+ (i));
            try{
                Thread.sleep(interval);
            }catch (InterruptedException e) {
                System.out.println("\ninterrupted");
            }
        }
    }
    public static void main(String[] args)
    {
        TwoThread task1 = new TwoThread(1,10,1000);
        TwoThread task2 = new TwoThread(11,20,500);
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}