package com.company;

import netscape.javascript.JSUtil;

public class Cwh_15_ps3
{
    public static void main(String[] args)
    {
        // Problem 1
        String name = "Peter Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To Lower Case     Letter";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a Lot!"; // <| |>, to replace.
        letter = letter.replace("<|name|>", "Rashed");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  ")); // "double spaces", if false will print "-1"
        System.out.println(myString.indexOf("   ")); // "Triple spaces"

        // Problem 5
        String myLetter = "Dear Harry, \n\t\tThis Java course is Nice. \n\t\tThanks!";
        System.out.println(myLetter);
    }
}
