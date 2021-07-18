package com.company;

class MyEmployee1
{
    int id = 0;
    String name = "CodeWithHarry";

    public MyEmployee1()
    {
        id = 45;
        name = "CodeWithHarry";
    }

    public MyEmployee1(String myName, int myId)
    {
        id = myId;
        name = myName;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}

public class Cwh_42_constructors
{
    public static void main(String[] args)
    {
        MyEmployee1 harry = new MyEmployee1("ProgrammingWithHarry", 12);

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
