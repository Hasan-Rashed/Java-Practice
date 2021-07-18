package com.company;

interface SampleInterface
{
    void math1();
    void math2();
}

interface ChildSampleInterface extends SampleInterface
{
   void math3();
   void math4();
}

class MySampleClass implements ChildSampleInterface
{
    @Override
    public void math1()
    {
        System.out.println("math1");
    }

    @Override
    public void math2()
    {
        System.out.println("Math2");
    }

    @Override
    public void math3()
    {
        System.out.println("math3");
    }

    @Override
    public void math4()
    {
        System.out.println("Math4");
    }
}

public class Cwh_58_inheritance_interface
{
    public static void main(String[] args)
    {
        MySampleClass mySampleClass = new MySampleClass();
        mySampleClass.math1();
        mySampleClass.math2();
        mySampleClass.math3();
        mySampleClass.math4();
    }
}
