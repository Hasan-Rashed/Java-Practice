package cses;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int [] arr = new int[n - 1];

        for (int i = 0; i < n - 1; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (n == 2)
        {
            if (arr[0] == 1)
                System.out.print(2);

            else
                System.out.print(1);
        }

        else if (n > 2)
        {
            for (int i = 0; i < n - 2; i++)
            {
                if((arr[i + 1] - arr[i]) != 1)
                {
                    num = arr[i + 1] - 1;
                    break;
                }
            }
            System.out.println(num);
        }
    }
}
