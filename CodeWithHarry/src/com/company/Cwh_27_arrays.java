package com.company;

public class Cwh_27_arrays
{
    public static void main(String[] args)
    {
        int [] marks = {12, 23, 34, 45, 56, 67, 78};
        System.out.println(marks[5]);
        System.out.println(marks.length);

        float [] marks1 = {21.4f, 32, 43, 54, 65, 76, 87};
        System.out.println(marks1[5]);
        System.out.println(marks1.length);

        String [] name = {"Kamrul", "Hasan", "Mazumder", "Rashed"};
        for(int i = 0; i < name.length; i++)
        {
            System.out.println(name[i]);
        }
        System.out.println(name.length);
    }
}
