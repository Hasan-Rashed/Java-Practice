package com.company;

import java.util.Scanner;

public class Cwh_79_ErrorsDemo
{
    public static void main(String[] args)
    {
        // Syntax error demo
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // Logical error demo
        System.out.println(2);

        for (int i = 1; i < 5; i++)
        {
            System.out.println(2 * i + 1);
        }

        // Runtime time error
        int k;
        Scanner input = new Scanner(System.in);
        k = input.nextInt();
        System.out.println("Integer part of divided by k is: " + 1000 / k);
    }
}
