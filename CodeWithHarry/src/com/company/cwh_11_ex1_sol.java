package com.company;
import java.util.Scanner;

public class cwh_11_ex1_sol
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your physics marks: ");
        int physics = scan.nextInt();
        System.out.print("Enter your English marks: ");
        int English = scan.nextInt();
        System.out.print("Enter your Chemistry marks: ");
        int Chemistry = scan.nextInt();
        System.out.print("Enter your Mathematics marks: ");
        int Mathematics = scan.nextInt();
        System.out.print("Enter your Computer Science marks: ");
        int Computer = scan.nextInt();

        float percentage = ((physics + English + Chemistry + Mathematics + Computer) / 500.0f ) * 100;

        System.out.println("Percentage: " + percentage);
    }
}
