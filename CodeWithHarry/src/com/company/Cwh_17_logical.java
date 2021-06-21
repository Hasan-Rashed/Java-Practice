package com.company;

public class Cwh_17_logical
{
    public static void main(String[] args)
    {
        System.out.println("for Logical AND....");
        boolean a = true;
        boolean b = false;

        if (a && b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println("for Logical OR....");

        if (a || b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println("For Logical NOT...");

        System.out.print("Not(A) is ");
        System.out.println(!a);

        System.out.print("Not(B) is ");
        System.out.println(!b);
    }
}
