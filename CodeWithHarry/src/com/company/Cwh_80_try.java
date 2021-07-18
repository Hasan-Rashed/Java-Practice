package com.company;

public class Cwh_80_try
{
    public static void main(String[] args)
    {
        int a = 6000;
        int b = 0;

        try
        {
            int c = a / b;
            System.out.println("The result is: " + c);
        }
        catch(Exception e)
        {
            System.out.println("We failed to divide. Reason: " + e);
        }
        System.out.println("End of the program");
    }
}
