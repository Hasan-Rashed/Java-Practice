package com.company;

import java.util.Scanner;

public class Cwh_13_strings
{
    public static void main(String[] args)
    {
        // String name = new String("Hasan");
        String name = "Hasan";
        System.out.print("The name is: ");
        System.out.println(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is: %d and value of b is: %f\n", a, b);
        // System.out.format("The value of a is: %d and value of b is: %f", a, b); // format and printf function is same.

        Scanner sc = new Scanner(System.in);
        //String st = sc.next(); // Scan only a word or character
        String st = sc.nextLine(); // Scan entire line.
        System.out.println(st);

        double l = 3.4;
        System.out.printf("%8.2f", l);
    }
}
