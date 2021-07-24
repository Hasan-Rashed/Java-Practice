package com.company;

import java.util.ArrayList;

public class Cwh_91_arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList <>();
        ArrayList<Integer> list2 = new ArrayList <>(5);

        list2.add(15);
        list2.add(18);
        list.add(19);

        list.add(6);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(0, 5);
        list.add(0, 1);
        list.addAll(list2);

        System.out.println(list.contains(list.contains(27)));

        System.out.println(list.contains(6));
        System.out.println(list.lastIndexOf(6));
//        list.clear();
//
        list.set(1, 566);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
            System.out.print(", ");
            System.out.println("Index of ");
        }
    }
}
