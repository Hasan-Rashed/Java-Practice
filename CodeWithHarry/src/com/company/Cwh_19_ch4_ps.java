package com.company;
import java.util.Scanner;

public class Cwh_19_ch4_ps<year>
{
    public static void main(String[] args)
    {
        // Question 1
        int a = 10;
        if(a == 1)
        {
            System.out.println("I am 10");
        }
        else
        {
            System.out.println("I am 11");
        }

        // Question 2
        System.out.println();
        Scanner sc = new Scanner(System.in);
        byte m1, m2, m3;
        System.out.print("Enter your marks in Physics: ");
        m1 = sc.nextByte();

        System.out.print("Enter your marks in Chemistry: ");
        m2 = sc.nextByte();

        System.out.print("Enter your marks in Mathematics: ");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3f;
        System.out.println("Your overall percentage is: " + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33)
        {
            System.out.println("Congratulations! you have been promoted");
        }
        else
        {
            System.out.println("Sorry! you have not been promoted");
        }

        // Question 3
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income in Lakhs per annum: ");
        float tax = 0;
        float income = input.nextFloat();

        if(income <= 2.5)
        {
            tax += 0;
        }
        else if (income > 2.5f && income <= 5f)
        {
            tax += 0.05f * (income - 2.5f);
        }
        else if (income > 5f && income <= 10f)
        {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (income - 5f);
        }
        else if (income > 10.0f)
        {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0f - 5f);
            tax += 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee si: " + tax);

        // Question 4
        System.out.println();
        Scanner inputDay = new Scanner(System.in);
        int day = inputDay.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // Question 5
        System.out.println();
        Scanner sc1 = new Scanner(System.in);
        int year;
        year = sc1.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year.");
        }

        // Question 6
        System.out.println();
        Scanner sc2 = new Scanner(System.in);
        String website = sc1.next();
        if(website.endsWith(".com"))
        {
            System.out.println("This is an Commercial website");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println("This is an Organizational website");
        }
        else if (website.endsWith(".in"))
        {
            System.out.println("This is an Indian website");
        }
    }
}
