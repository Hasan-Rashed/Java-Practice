package com.company;

class Employee1
{
    int salary; // property
    String name; // property

    public int getSalary1() //methods
    {
        return salary;
    }

    public void setName1(String nam) //methods
    {
        name = nam;
    }

    public String getName1() //methods
    {
        return name;
    }
}

class CellPhone
{
    public void ring()
    {
        System.out.println("Ringing....");
    }

    public void vibrate()
    {
        System.out.println("Vibrating....");
    }

    public void callFriend()
    {
        System.out.println("Calling Hasan....");
    }
}

class Square
{
    int side;
    public int area()
    {
        return side * side;
    }

    public int perimeter()
    {
        return 4 * side;
    }
}

class Rectangle
{
    int wide, length;

    public int rectArea()
    {
        return wide * length;
    }

    public int rectPerimeter()
    {
        return 2 * (wide + length);
    }
}

class ViceCity
{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }

    public void run()
    {
        System.out.println("Running from the enemy");
    }

    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}

class Circle
{
    double pi;
    int r;
    public double circleArea()
    {
        return pi * r * r;
    }

    public double circlePerimeter()
    {
        return 2 * pi * r;
    }
}

public class Cwh_39_ch_8_ps
{
    public static void main(String[] args)
    {
        // problem 1
        Employee1 rashed = new Employee1();
        rashed.setName1("CodeWithRashed");
        rashed.salary = 233;
        System.out.println(rashed.getSalary1());
        System.out.println(rashed.getName1());

        // problem 2
        CellPhone samsung = new CellPhone();
        samsung.callFriend();
        samsung.ring();
        samsung.vibrate();

        // problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // problem 4
        Rectangle rec = new Rectangle();
        rec.length = 3;
        rec.wide = 4;
        System.out.println(rec.rectArea());
        System.out.println(rec.rectPerimeter());

        // problem 5
        ViceCity player1 = new ViceCity();
        player1.fire();
        player1.hit();
        player1.run();

        // problem 6
        Circle c = new Circle();
        c.pi = 3.1416;
        c.r = 4;
        System.out.println(c.circleArea());
        System.out.println(c.circlePerimeter());
    }
}
