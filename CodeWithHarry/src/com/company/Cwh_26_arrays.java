package com.company;

public class Cwh_26_arrays
{
    public static void main(String[] args)
    {
        /*Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */

        // Three ways to create Arrays in Java
        // Way 1 Declaration and allocation
        int [] marks1;
        marks1 = new int[5];

        marks1[0] = 1;
        marks1[1] = 2;
        marks1[2] = 3;
        marks1[3] = 4;
        marks1[4] = 5;

        System.out.println(marks1[4]);

        // Way 2 Declaration and then allocation
        int [] marks2 = new int[5];

        marks2[0] = 1;
        marks2[1] = 2;
        marks2[2] = 3;
        marks2[3] = 4;
        marks2[4] = 5;

        System.out.println(marks2[4]);

        // Way 3 Declaration and initialization
        int [] marks3 = {3, 5, 4, 6, 8, 9, 0, 1, 13};;

        for (int i: marks3) // for each loop
        {
            System.out.println(i);
        }
        System.out.println(marks1.length);
    }
}
