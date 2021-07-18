package com.company;

class Base1
{
    Base1()
    {
        System.out.println("I am a constructor.");
    }

    public Base1(int x)
    {
        System.out.println("I am a overloading constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1
{
    // Base1
    public Derived1()
    {
        //super(2); // to call the constructor of super class with parameter
        System.out.println("I am a derived class constructor.");
    }

    public Derived1(int x, int y)
    {
        super(x);
        System.out.println("I am a overloading constructor of derived with value of y as: " + y);
    }
}

class ChildOfDerived1 extends Derived1
{
    public ChildOfDerived1()
    {
        System.out.println("I am a child of derived constructor.");
    }

    public ChildOfDerived1(int x , int y, int z)
    {
        super(x, y); //to call the constructor of super class with parameter
        System.out.println("I am a overloading constructor of child of derived with value of z as: " + z);
    }

}

public class Cwh_46_constructors_in_inheritance
{
    public static void main(String[] args)
    {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        //Derived1 d1 = new Derived1(14, 9);
        //ChildOfDerived1 cd = new ChildOfDerived1();
        ChildOfDerived1 cd = new ChildOfDerived1(12, 13, 15);
    }
}
