package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cwh_101_date_time_formatter
{
    public static void main(String[] args)
    {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);
        String myDate2 = dt.format(df2);

        System.out.println(myDate);
        System.out.println(myDate2);
    }
}
