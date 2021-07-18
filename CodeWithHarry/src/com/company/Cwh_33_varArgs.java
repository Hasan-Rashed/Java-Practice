package com.company;

public class Cwh_33_varArgs
{
    /*static int sum(int a, int b)
    {
        return a + b;
    }
    static int sum(int a, int b, int c)
    {
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }*/

    static int sum(int ... arr)// if i don't know the number of parameters
    {
        // Available as int [] arr;
        int result = 0;
        for (int a : arr)
        {
            result += a;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("welcome to varargs tutorial");
        System.out.println("the sum of Nothing is: " + sum());
        System.out.println("the sum of 4 and 5: " + sum(4, 5));
        System.out.println("the sum of 4 and 5: " + sum(4, 5, 6));
        System.out.println("the sum of 4 and 5: " + sum(4, 5, 7, 6));
        System.out.println("the sum of 4 and 5: " + sum(1, 4, 5, 7, 6));
    }
}
