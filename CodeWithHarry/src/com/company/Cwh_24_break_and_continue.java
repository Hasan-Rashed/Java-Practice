package com.company;

public class Cwh_24_break_and_continue
{
    public static void main(String[] args)
    {
        // Break and Continue using loop!
        for (int i = 0; i < 20; i++)
        {
            if (i == 2)
            {
                System.out.println("continue when i = 2: ");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great.");

            if(i == 4)
            {
                System.out.println("Ending the loop.");
                break;
            }
        }

        System.out.println("Swap without using third variable: ");
        int a = 5, b = 10;
        a = a - b; // -5
        b = a + b; // 5
        a = b - a; // 10
        System.out.println("\na: " + a + " b: " + b);
    }
}
