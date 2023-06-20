import java.util.Scanner;
class fun
{
    void multiply(int a,int b)
    {
        int c;
        c=a*b;
        System.out.println("The product of "+a+" and "+b+" is "+c);
    }
    void multiply(Float a,Float b)
    {
        int c;
        c=a*b;
        System.out.println("The product of "+a+" and "+b+" is "+c);
    }
    void multiply(Double a,Double b)
    {
        int c;
        c=a*b;
        System.out.println("The product of "+a+" and "+b+" is "+c);
    }
}
class A4
{
    public static void main(String[]args)
    {
        
        fun ob=new fun();
        ob.multiply(10,30);
    }
}