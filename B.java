//File 2 :

package bpack;
import apack.A;

public class B extends A
{
    public B()
    {
        super(1,2,3);
    }
    public void Display()
    {
        System.out.print("\nThis is display of class B from bpack.");
        System.out.print("\nPublic variable = " + (pubVar));
        System.out.print("\nProtected variable = " + (protVar));
        System.out.print("\nPrivate variable(via getter) = " + getPriv());
    }
}