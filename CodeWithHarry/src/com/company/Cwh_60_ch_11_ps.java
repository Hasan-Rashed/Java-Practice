package com.company;

// problem 1
abstract class Pen
{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen
{
    void write()
    {
        System.out.println("Write");
    }

    void refill()
    {
        System.out.println("Refill");
    }

    void changeNib()
    {
        System.out.println("Changing the Nib");
    }
}

// problem 2
class Monkey
{
    void jump()
    {
        System.out.println("Jumping...");
    }

    void bit()
    {
        System.out.println("Biting...");
    }
}

interface BasicAnimal
{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println("Hello Sir!");
    }

    @Override
    public void eat()
    {
        System.out.println("Eating...");
    }

    @Override
    public void sleep()
    {
        System.out.println("Sleeping...");
    }
}

// problem 4
abstract class Telephone
{
    abstract void ring();
    abstract void light();
    abstract void disconnect();
}

class SmartPhone1 extends Telephone
{
    @Override
    public void ring()
    {
        System.out.println("Ringing...");
    }

    @Override
    public void light()
    {
        System.out.println("Terning on the light...");
    }

    @Override
    public void disconnect()
    {
        System.out.println("Disconnecting the telephone...");
    }
}

//problem 6
interface TvRemote
{
    void remote1();
}
interface SmartTvRemote extends TvRemote
{
    @Override
    void remote1();
    void remote2();
}

// problem 7
class Tv implements TvRemote, SmartTvRemote
{
    @Override
    public void remote1()
    {
        System.out.println("Remote1..");
    }

    @Override
    public void remote2()
    {
        System.out.println("Remote2...");
    }
}

public class Cwh_60_ch_11_ps
{
    public static void main(String[] args)
    {
        //problem 1
        System.out.println("Problem 1");
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();

        // problem 3
        System.out.println();
        System.out.println("Problem 2");
        Human rashed = new Human();
        rashed.jump();
        rashed.bit();
        rashed.eat();
        rashed.sleep();
        rashed.speak();

        // problem 4
        System.out.println();
        System.out.println("Problem 3");
        SmartPhone1 samsung = new SmartPhone1();
        samsung.ring();
        samsung.light();
        samsung.disconnect();

        // problem 5
        Monkey m1 = new Human();
        System.out.println();
        System.out.println("Problem 5");
        //m1.speak(); // cannot use method because the reference is monkey which does not have speak method
        m1.jump();
        m1.bit();

        System.out.println();
        System.out.println("Problem 6, 7");
        Tv walton = new Tv();
        walton.remote1();
        walton.remote1();
    }
}
