package com.company;
import java.util.Scanner;


public class Calculator
{
    static double operate(double num1, char ch, double num2)
    {
        switch (ch)
        {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;

        }
        return 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        char ch;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter operator: ");
        ch = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Result is: " + operate(num1, ch, num2));
    }
}
