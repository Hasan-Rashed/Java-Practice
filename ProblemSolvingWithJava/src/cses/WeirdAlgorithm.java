package cses;

import java.util.Scanner;

public class WeirdAlgorithm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        while (n > 0)
        {
            System.out.print(n + " ");

            if (n == 1)
            {
                break;
            }

            else if(n % 2 == 0)
            {
                n /= 2;
            }

            else if (n % 2 == 1)
            {
                n = n * 3 + 1;
            }
        }
    }
}