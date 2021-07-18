package com.company;

import java.util.Random;
import java.util.Scanner;

class Game1
{
    public int number, noOfGuesses = 0, inputNumber;

    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses)
    {
        this.noOfGuesses = noOfGuesses;
    }

    Game1()
    {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void takeUserInput()
    {
        System.out.print("Guess the number: ");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
    }

    boolean isCorrect()
    {
        noOfGuesses++;
        if(inputNumber == number)
        {
            System.out.format("Yes you guessed it right, it was %d\nyou guessed it in %d attemps", number, noOfGuesses);
            return true;
        }
        else if (inputNumber < number)
        {
            System.out.println("Too low...");
        }
        else if (inputNumber > number)
        {
            System.out.println("Too high...");
        }

        return false;
    }
}

public class Cwh_50_ex3sol
{
    public static void main(String[] args)
    {
        Game1 g = new Game1();
        boolean b = false;

        while (!b)
        {
            g.takeUserInput();
            g.isCorrect();
        }
    }
}
