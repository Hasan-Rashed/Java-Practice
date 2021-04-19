package com.company;
import java.util.Scanner;
public class PercentageMarks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int total, eng, phy, chem, math, comp, allTotal;
        double percentage;
        System.out.print("Enter total Marks: ");
        total = sc.nextInt();
        System.out.print("Enter Marks of English: ");
        eng = sc.nextInt();
        System.out.print("Enter Marks of English: ");
        phy = sc.nextInt();
        System.out.print("Enter Marks of English: ");
        chem = sc.nextInt();
        System.out.print("Enter Marks of English: ");
        math = sc.nextInt();
        System.out.print("Enter Marks of English: ");
        comp = sc.nextInt();

        allTotal = eng + phy + chem + math + comp;
        percentage = ((double) allTotal / total) * 100;
        System.out.println("Percentage of Marks is: " + percentage + "%");
    }
}
