package com.company;

public class Cwh_85_finally
{
    public static int greet()
    {
        try
        {
            int a = 50;
            int b = 2;
            int c = a / b;

            return c;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Cleaning up resources...This is the end of this function.");
        }
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.println(greet());
    }
}