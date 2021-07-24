package com.company;

import java.util.Scanner;

public class Cwh_86_ps_14
{
    public static void main(String[] args)
    {
        // problem error
        //int a = 7; // Syntax error
        int age = 34;
        int year_born = 2000-age; // logical error
        //System.out.println(6 / 0); // runtime error

        // problem 2
        try
        {
            int a = 666 / 9;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("hehe");
        }
        catch(ArithmeticException e)
        {
            System.out.println("haha");
        }

        // problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i < 5)
        {
            try
            {
                System.out.print("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);

                break;
            }
            catch(Exception e)
            {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i >= 5)
        {
            System.out.println("Error!");
        }
    }
}
