package com.company;

class ClassOne
{
    int a;

    public ClassOne(int a)
    {
        this.a = a; // this is a reference
    }

    public int getA()
    {
        return a;
    }

    public int returnone()
    {
        return 1;
    }
}

class ClassTwo extends ClassOne
{
    ClassTwo(int c)
    {
        super(c); // use to refer the object of immediate class
        System.out.println("I am a constructor.");
    }
}

public class Cwh_47_this_super
{
    public static void main(String[] args)
    {
        ClassOne e = new ClassOne(65);
        System.out.println(e.getA());

        ClassTwo ct = new ClassTwo(5);
        System.out.println(ct.getA());
    }
}
