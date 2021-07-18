package com.company;

import java.lang.management.MemoryType;

class Cylinder
{
    private int radius, height;

    public Cylinder(int radius, int height)
    {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getRadius()
    {
        return radius;
    }

    public int getHeight()
    {
        return height;
    }

    public double surfaceArea()
    {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume()
    {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle1
{
    private int length, breadth;

    public Rectangle1()
    {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }
}

public class Cwh_44_ps_09
{
    public static void main(String[] args)
    {
        // problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());

        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        // problem 3
        // using constructor

        // problem 4
        Rectangle1 r = new Rectangle1(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
