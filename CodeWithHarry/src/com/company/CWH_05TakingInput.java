package com.company;
import java.util.Scanner;

public class CWH_05TakingInput
{
    public static void main(String[] args)
    {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of these numbers is: " + sum);
         String str = sc.nextLine();
        System.out.println(str);
    }
}
