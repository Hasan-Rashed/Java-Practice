package com.company;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class Cwh_97_date_Class
{
    public static void main(String[] args)
    {
        //System.out.println(Long.MAX_VALUE);
        //System.out.println(currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
