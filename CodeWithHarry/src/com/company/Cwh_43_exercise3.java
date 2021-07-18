package com.company;

import java.util.Random;
import java.util.Scanner;

class Game
{
    int noOfGuesses = 0, userInput, randomNumber;
    boolean correct;

    public void takeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("userInput between 0 and 100: ");
        userInput = sc.nextInt();
    }

    public Game()
    {
        Random random = new Random();
        randomNumber = random.nextInt(100);
        //System.out.println("RandomNumber: " + randomNumber);
    }

    public boolean isCorrectNumber()
    {
        if (randomNumber == userInput)
        {
            correct = true;
        }
        else if(randomNumber > userInput)
        {
            System.out.println("Low");
        }
        else if(randomNumber < userInput)
        {
            System.out.println("High");
        }
        else
        {
            correct = false;
        }
        return correct;
    }

    public void setter(int num)
    {
        noOfGuesses += num;
    }

    public int getter()
    {
        return noOfGuesses;
    }
}

public class Cwh_43_exercise3
{
    public static void main(String[] args)
    {
        Game Pubg = new Game();

        while (!Pubg.isCorrectNumber())
        {
            Pubg.takeUserInput();
            Pubg.setter(1);

            if (Pubg.isCorrectNumber())
            {
                System.out.println("You won the game at: " + Pubg.getter() + "\nYou entered: " + Pubg.userInput + " and random number was: " + Pubg.randomNumber);
            }
            else
            {
                System.out.println("Please Try again!!");
            }
        }
    }
}