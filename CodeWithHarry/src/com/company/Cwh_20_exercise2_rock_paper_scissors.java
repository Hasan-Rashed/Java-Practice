package com.company;

//import javafx.scene.transform.Scale;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Cwh_20_exercise2_rock_paper_scissors
{
    enum move
    {
        ROCK,
        PAPER,
        SCISSORS
    }

    static String getPlayerMove()
    {
        Scanner scan = new Scanner(System.in);

        String choice = scan.next();
        String playerChoice = choice.toUpperCase();
        scan.close();

        if(playerChoice.equals("ROCK") || playerChoice.equals("PAPER") || playerChoice.equals("SCISSOR"))
        {
            return playerChoice;
        }
        else
        {
            System.out.println("This is not valid move, Try again!");
            return "Bad Input";
        }
    }

    static String getComputerMove()
    {
        String computeChoice;
        Random random = new Random();
        int input = random.nextInt(3) + 1;

        if(input == 1)
        {
            computeChoice = move.ROCK.name();
        }
        else if (input == 2)
        {
            computeChoice = move.PAPER.name();
        }
        else
        {
            computeChoice = move.SCISSORS.name();
        }

        return computeChoice;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Rock Paper Game! \nYour's Game partner is Computer. \nEnter Your Move:  ");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");

        String playMove = getPlayerMove();
        System.out.println("Your move is: " + playMove);
        if (!playMove.equals("Bad Input"))
        {
            String computerMove = getPlayerMove();
            System.out.println("Computer move is: " + computerMove);
            if(playMove.equals(computerMove))
            {
                System.out.println("Game is tie !!");
            }

            else if (playMove.equals(move.ROCK.name()))
            {
                if (computerMove.equals(move.PAPER.name()))
                {
                    System.out.println("Computer wins, Better Luck Next Time!");
                }
                else
                {
                    System.out.println("You win!");
                    System.out.println("OOhhOO, Congratulations!!!");
                }
            }

            else if (playMove.equals(move.PAPER.name()))
            {
                if(computerMove.equals(move.SCISSORS.name()))
                {
                    System.out.println("Computer Wins");
                    System.out.println("Better Luck Next Time!");
                }
                else {
                    System.out.println("You Win!");
                    System.out.println("OOhhOO, Congratulations!!! ");
                }
            }

            else
            {
                if (computerMove.equals(move.ROCK.name()))
                {
                    System.out.println("Computer Wins");
                    System.out.println("Better Luck Next Time!");
                } else {
                    System.out.println("You Win!");
                    System.out.println("OOhhOO, Congratulations!!! ");
                }
            }
        }
    }
}
