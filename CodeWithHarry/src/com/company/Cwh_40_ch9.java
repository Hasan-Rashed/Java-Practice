package com.company;

class MyEmployee
{
    private int id;
    private String name;

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public void setId(int i)
    {
        id = i;
    }

    public int getId()
    {
        return id;
    }
}

public class Cwh_40_ch9
{
    public static void main(String[] args)
    {
        MyEmployee harry = new MyEmployee();
        harry.setId(45);
        harry.setName("CodeWithHarry");

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
