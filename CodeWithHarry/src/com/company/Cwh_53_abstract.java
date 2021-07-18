package com.company;

abstract class Parent
{
    public Parent()
    {
        System.out.println("I'm the constructor of Parent.");
    }

    public void sayHello()
    {
        System.out.println("Hello.");
    }

    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent
{
    @Override
    public void greet()
    {
        System.out.println("Good morning.");
    }

    @Override
    public void greet2()
    {
        System.out.println("Good afternoon.");
    }
}

abstract class Child2 extends Parent
{
    public void th()
    {
        System.out.println("I am good.");
    }
}

public class Cwh_53_abstract
{
    public static void main(String[] args)
    {
        //Parent parent = new Parent(); // cannot define abstracts classes object
        Child child = new Child();
        //Child2 child2 = new Child2(); // cannot define abstracts classes object
    }
}