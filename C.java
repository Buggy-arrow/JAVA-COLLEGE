//File 3 :
 
package cpack;
import apack.A;

public class C
{
    A a = new A(4,5,6);
    public void Display()
    {
        System.out.print("\nThis is display of class C from cpack.");
        System.out.print("\nPublic variable = " + (a.pubVar));
        //System.out.print("\nProtected variable = " + (a.protVar));
        //System.out.print("\nPrivate variable = " + (a.privVar));
    }
}