package com.company;

interface Bicycle
{
    int a = 45; // by default final
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle
{
    void blowHorn3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle
{
    void blowHorn()
    {
        System.out.println("Pee Pee Poo Poo.");
    }

    public void applyBrake(int decrement)
    {
        System.out.println("Applying Brake.");
    }
    public void speedUp(int increment)
    {
        System.out.println("Applying SpeedUp.");
    }

    public void blowHorn3g()
    {
        System.out.println("Kabhi Khusi kabi gum pee pee pee pee.");
    }

    public void blowHornmhn()
    {
        System.out.println("Main hoon naa po po po po.");
    }
}

public class Cwh_54_interface
{
    public static void main(String[] args)
    {
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.applyBrake(1);
        // you cannot create properties in Interface
        System.out.println(avonCycle.a);
        // You cannot modify the properties in Interface as they are final.
        //avonCycle.a = 334;
        //System.out.println(a);

        avonCycle.blowHorn3g();
        avonCycle.blowHornmhn();
    }
}