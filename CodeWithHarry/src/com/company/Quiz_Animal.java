package com.company;

class Animal
{
    public void sleep()
    {
        System.out.println("Sleeping: Zzzzz");
    }

    public void makeNoise()
    {
        System.out.println("Noises...");
    }

    public void roam()
    {
        System.out.println("Roamin’ on the plain.");

    }
}

class Lion extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Roaring: Rrrrrr!");
    }
}

class Cat extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Miaowing: Miaooo!");
    }
}

class Wolf extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Howling: Ouooooo");
    }
}

class Dog extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Barking: Woof Woof!");
    }
}

class Feline extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Roaming: I’m roaming alone.");
    }
}

class Canine extends Animal
{
    @Override
    public void makeNoise()
    {
        System.out.println("Roaming: I’m with my pack.");
    }
}

public class Quiz_Animal
{
    public static void main(String[] args)
    {
        System.out.println("\nWolf\n=====");

        Wolf wolfie = new Wolf();
        wolfie.makeNoise();
        wolfie.roam();
        wolfie.sleep();

        System.out.println("\nLion\n=====");
        Lion leo = new Lion();
        leo.makeNoise();
        leo.roam();
        leo.sleep();
    }
}
