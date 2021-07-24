package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Cwh_102_ps
{
    public static void main(String[] args)
    {
        // problem 1
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");

        for (Object o : ar)
        {
            System.out.println(o);
        }

        // problem 2
        Date d = new Date();
        System.out.println(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());

        // problem 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));

        // problem 4
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H : m : s"); // This is the format
        String myDate = dt.format(df);
        System.out.println(myDate);

        // problem 5

        HashSet <Integer> s = new HashSet <>();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);
    }
}
