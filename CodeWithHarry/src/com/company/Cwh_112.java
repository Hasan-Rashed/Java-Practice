package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated
{
    @Deprecated
    void math1()
    {
        System.out.println("I am method 1");
    }
}

interface MyInt
{
    void display();
}

public class Cwh_112
{
    public static void main(String[] args)
    {
//        MyDeprecated d = new MyDeprecated();
//        d.math1();
//
//        MyInt i = () -> System.out.println("I am display");
        int i = 5;
        String table = "";
        for (int j = 0; j < 10; j++)
        {
            table += i + "X" + (j + 1) + "=" + i*(j+1);
            table += "\n";
        }
        try
        {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}