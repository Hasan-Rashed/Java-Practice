package com.company;

public class CWH_09_Ch2_op_pre
{
    public static void main(String[] args)
    {
        int a = 6 * 5 - 34 / 2;
        /* precedence & Associativity
            = 30 - 34 / 2
            = 30 - 17
            = 13
         */
        System.out.println(a);

        int b = 60 / 5 - 34 * 2;
        /* Precedence & Associativity
            = 12 - 34 / 2
            = 12 - 68
            = 56
         */
        System.out.println(b);

        int x = 1, y = 4, z = 5;
        int k = y * y - 4 * x * z / 2 * a;
    }
}
