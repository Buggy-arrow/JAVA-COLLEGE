//File 1 :

package apack;

public class A
{
    public int pubVar;
    protected int protVar;
    private int privVar;
    public A(int pub,int prot,int priv)
    {
        pubVar = pub;
        protVar = prot;
        privVar = priv;
    }
    public int getPriv()
    {
        return privVar;
    }
}