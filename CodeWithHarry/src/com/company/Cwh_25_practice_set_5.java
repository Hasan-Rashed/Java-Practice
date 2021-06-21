package com.company;

public class Cwh_25_practice_set_5
{
    public static void main(String[] args)
    {
        // Practice problem 1
        System.out.println("Practice problem 1: ");
        int n = 4;
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Practice problem 2
        System.out.println("Practice problem 2: ");

        int i = 0, sum = 0;
        while (i < n)
        {
            sum += 2 * i; // 2 * i generates Even numbers
            i++;
        }
        System.out.println("Sum of even numbers: " + sum);

        // Practice problem 3
        System.out.println("\nPractice problem 3: ");

        int num = 5;
        for (int j = 1; j <= 10; j++)
        {
            System.out.println(num + " X " + j + " = " + num * j);
        }

        // Practice problem 4
        System.out.println("\nPractice problem 4: ");

        int num1 = 10;
        for (int j = 10; j >= 1; j--)
        {
            System.out.println(num1 + " X " + j + " = " + num1 * j);
        }

        // Practice problem 5
        System.out.println("\nPractice problem 5: ");

        int factNum = 4;
        int fact = 1;
        for (int k = 1; k <= factNum; k++)
        {
            fact = fact * k;
        }
        System.out.println("Factorial of " + factNum + " using for is " + fact);

        // Practice problem 6
        System.out.println("\nPractice problem 6: ");

        int factNum1 = 4;
        int fact1 = 1;
        int l = 1;
        while (l <= factNum1)
        {
            fact1 = fact1 * l;
            l++;
        }
        System.out.println("Factorial of " + factNum + " using while is " + fact);

        // Practice problem 9
        System.out.println("\nPractice problem 9: ");

        int num2 = 8;
        int sumMul = 0;
        for (int j = 1; j <= 10; j++)
        {
            sumMul += num2 * j;
        }
        System.out.println(sumMul);
    }
}
