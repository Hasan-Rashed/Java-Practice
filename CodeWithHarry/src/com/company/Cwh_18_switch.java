package com.company;

import java.util.Scanner;

public class Cwh_18_switch
{
    public static void main(String[] args)
    {
        char var = 'r';
        switch (var)
        {
            case 'c':
                System.out.println("You are going to become an adult.");
                break;
            case 'r':
                System.out.println("You are going to join a job!");
                break;
            case 'd':
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
    }
}
