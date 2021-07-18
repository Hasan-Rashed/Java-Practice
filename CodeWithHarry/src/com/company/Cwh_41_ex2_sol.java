package com.company;

import java.util.Random;
import java.util.Scanner;

public class Cwh_41_ex2_sol
{
    public static void main(String[] args)
    {
//      0 for rock
//      1 for paper
//      2 for scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for Paper, 2 for scissor: ");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int computerInput = rand.nextInt(3);

        if(userInput == computerInput)
        {
            System.out.println("Draw");
        }

        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1)
        {
            System.out.println("You win!!");
        }

        else
        {
            System.out.println("Computer win!!");
        }

        if(computerInput == 0)
        {
            System.out.println("Computer choice: Rock, your choice: " + userInput);
        }
        if(computerInput == 1)
        {
            System.out.println("Computer choice: Paper, your choice: " + userInput);
        }
        if(computerInput == 2)
        {
            System.out.println("Computer choice: Scissor, your choice: " + userInput);
        }

    }
}