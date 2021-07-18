package com.company;

import java.security.spec.RSAOtherPrimeInfo;

class Circle1
{
    public int radius;

    Circle1()
    {
        System.out.println("I am non parameterized default constructor of circle1.");
    }

    public Circle1(int r)
    {
        System.out.println("I am circle1 parameterized constructor.");
        this.radius = r;
    }

    public double area()
    {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle1
{
    public int height;

    public Cylinder1(int r, int h)
    {
        super(r);
        System.out.println("I am Cylinder1 parameterized constructor.");
        this.height = h;
    }

    public double volume()
    {
        return Math.PI * this.radius * this.radius * height;
    }
}

class Rectangle2
{
    public int length, weight;

    public Rectangle2(int length, int weight)
    {
        this.length = length;
        this.weight = weight;
    }

    public int rectangleArea()
    {
        return length * weight;
    }
}

class Cuboid extends Rectangle2
{
    public int height;

    public Cuboid(int length, int weight, int height)
    {
        super(length, weight);
        this.height = height;
    }

    public int cuboidArea()
    {
        return length * weight * height;
    }
}

public class Cwh_52_ch10_ps
{
    public static void main(String[] args)
    {
        // problem 1
        Circle1 objc = new Circle1(12);
        Cylinder1 obj = new Cylinder1(12, 4);

        //problem 2
        Rectangle2 rectangle = new Rectangle2(3, 4);
        System.out.println(rectangle.rectangleArea());

        Cuboid cuboid = new Cuboid(3, 4, 5);
        System.out.println(cuboid.cuboidArea());
    }
}
