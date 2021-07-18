package com.company;

class Phone
{
    public void on()
    {
        System.out.println("Turning on phone...");
    }

    public void showTime()
    {
        System.out.println("Time is 8 am.");
    }
}

class SmartPhone extends Phone
{
    @Override
    public void on()
    {
        System.out.println("Turning on Smart phone...");
    }

    public void music()
    {
        System.out.println("Playing music...");
    }
}

public class Cwh_49_dynamic_method_dispatch
{
    public static void main(String[] args)
    {
        //Phone obj = new Phone(); // Allowed
        //SmartPhone sobj = new SmartPhone(); // Allowed
        //obj.name();

        Phone obj = new SmartPhone(); // Reference of Phone Class and object of SmartPhone Class, Called Runtime polymorphism
        //SmartPhone obj2 = new Phone(); // Not allowed
        obj.showTime();
        obj.on();
        //obj.music(); // Not allowed
    }
}
