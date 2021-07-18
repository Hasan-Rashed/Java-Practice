package com.company;

import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString()";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

public class Cwh_83_exception_class
{
    public static void main(String[] args)
    {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        if (a < 9)
        {
            try
            {
//                throw new MyException();
                throw new ArithmeticException("This is an exception.");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();

                System.out.println("Finished");
            }
            System.out.println("Yes Finished");

        }
    }
}
