package cses;

import java.util.Arrays;
import java.util.Scanner;

public class Repetitions
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String str;
        int [] arr = {0, 0, 0, 0};


        str = in.nextLine();

        for (int i = 0; i < str.length() - 1; i++)
        {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);

            if (c1 == 'A' && c2 == 'A')
            {
                ++arr[0];
            }
            else if (c1 == 'C' && c2 == 'C')
            {
                ++arr[1];
            }
            if (c1 == 'G' && c2 == 'G')
            {
                ++arr[2];
            }
            if (c1 == 'T' && c2 == 'T')
            {
                ++arr[3];
            }
        }
        Arrays.sort(arr);
        System.out.println(++arr[3]);
    }
}
