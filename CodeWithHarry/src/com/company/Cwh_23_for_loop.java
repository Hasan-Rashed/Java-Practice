package com.company;
import java.util.Scanner;

public class Cwh_23_for_loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        for (int i = 1; ; i += 2)
        {
            System.out.println(i);
            count++;
            if (count > n)
            {
                break;
            }
        }
        // 2n = Even Numbers = 0, 2, 4, 6, 8
        // 2n + 1 = Odd Numbers = 1, 3, 5, 7, 9
        System.out.println("By using 2n + 1 formula: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(2 * i + 1);  // 2i + i for generate odd numbers
        }

        System.out.println("Printing first N natural numbers in reverse order: ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
