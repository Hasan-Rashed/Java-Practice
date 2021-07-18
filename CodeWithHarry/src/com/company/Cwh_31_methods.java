package com.company;

public class Cwh_31_methods
{
    static int logic(int x, int y)
    {
        int z;
        if (x > y)
        {
            z = x + y;
        }
        else
        {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;
        int c;
        //Cwh_31_methods obj = new Cwh_31_methods(); // Without using static keyword and using object of class
        //c = obj.logic(a, b); // Without using static keyword and using object of class
        c = logic(a, b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        //c1 = obj.logic(a1, b1); // Without using static keyword and using object of class
        c1 = logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);
    }
}
