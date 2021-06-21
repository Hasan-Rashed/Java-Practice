package com.company;

public class cwh_10_resulting_date_type
{
    public static void main(String[] args)
    {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);

        // Increment and Decrement operators
        int i = 56;
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int k = 7;
        System.out.println(++k * 8);
        char ch = 'a';
        System.out.println(ch);
        System.out.println(++ch);
    }
}
