package com.company;

public class Cwh_32_method_overloading
{
    static void foo()
    {
        System.out.println("Good morning bro!");
    }
    static void foo(int a )
    {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b)
    {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a)
    {
        a = 98;
    }
    static void change2(int [] arr)
    {
        arr[0] = 98;
    }
    static void tellJoke()
    {
        System.out.println("I Invented a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args)
    {
        //tellJoke();

        // case 1: changing the integer.
        int x = 45;
        change(x);
        System.out.println(x);

        // case 2: changing the array
        int [] marks = {12, 34, 54, 67, 78, 90};
        change2(marks);
        System.out.println("the value of x after running change is: " + marks[0]);

        // method overloading
        foo();
        foo(300);
        foo(300, 400);

    }
}
