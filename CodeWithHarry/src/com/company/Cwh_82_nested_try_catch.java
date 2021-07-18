package com.company;

import java.util.Scanner;

public class Cwh_82_nested_try_catch
{
    public static void main(String[] args)
    {
        int marks[] = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag)
        {
            System.out.print("Enter the index: ");
            int index = sc.nextInt();

            try
            {
                System.out.println("welcome to video no 82");
                try
                {
                    System.out.println(marks[index]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program.");
    }
}
