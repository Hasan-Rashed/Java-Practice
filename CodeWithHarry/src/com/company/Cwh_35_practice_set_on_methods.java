package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Cwh_35_practice_set_on_methods
{
    static void multiplication(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int natural(int n)
    {
        int sum = 0;
        if(n == 0) // base condition
        {
            return 0;
        }
        else
        {
            return sum += n + natural(n - 1);
        }
    }

    static void pattern2(int n)
    {
        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int fib(int n)
    {
        int first = 0, second = 1, fobo;
        if(n == 1 || n == 2)
        {
            return n - 1;
        }
        else
        {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void pattern3(int n)
    {
        if (n > 0)
        {
            pattern3(n - 1);
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print("* " +
                    "");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        // problem 1
        multiplication(7);

        // problem 2
        pattern1(5);

        // problem 3
        System.out.println(natural(3));

        // problem 4
        pattern2(7);

        // problem 5
        System.out.println(fib(7));

        // problem 7
        pattern3(5);
    }
}
