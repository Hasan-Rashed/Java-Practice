package com.company;
import java.util.Scanner;
public class CWH_Ch1_PS
{
    public static void main(String[] args)
    {
        //  Question1
        int a = 4, b = 7, c = 6;
        int sum = a + b + c;
        System.out.println(sum);

        // Question2
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;

        float cgpa = (subject1 + subject2 + subject3) / 30;
        System.out.println(cgpa);

        //  Question3
        System.out.print("what is your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day.");

        //   Question4
        System.out.print("Enter Number: ");
        System.out.println(sc.hasNext());
    }
}
