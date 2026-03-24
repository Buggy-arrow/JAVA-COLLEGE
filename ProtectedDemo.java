/*Practical 5.3 :  Write a Java program using four different packages to demonstrate the use of access
specifiers.
Package apack:
Define a class A with three variables:
public int pubVar
protected int protVar
private int privVar
Provide a constructor to initialize them.
Package bpack:
Define a class B that extends A.
Create a display() method that tries to access variables of A using inheritance.
Package cpack:
Define a class C with a display() method.
Inside display(), create an object of class A and try to access its variables.
Package dpack:
Define a class ProtectedDemo with main().
Create objects of class B and class C.
Call their respective display() methods to show which variables are accessible and which
are not. */

//File 4 :
package dpack;
import bpack.B;
import cpack.C;

class ProtectedDemo
{
   public static void main(String[] args)
    {
        //System.out.println("");
        B b = new B();
        C c = new C();
        b.Display();
        c.Display();
        return;
    }
}