package com.company;
import java.util.Locale;

public class Cwh_14_string_methods
{
    public static void main(String[] args)
    {
        String name = "Rashed";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);

        String nonTrimmedString = "     Rashed    ";
        System.out.println(nonTrimmedString); // Prints original String.
        System.out.println(nonTrimmedString.trim()); // Removes spaces from the strings before and after.
        System.out.println(name.substring(1)); // Prints strings from a particular index
        System.out.println(name.substring(2, 6)); // Prints strings from a particular index to particular index

        System.out.println(name.replace('h', 'k')); // Replace one character
        System.out.println(name.replace("hed", "Ras")); // Replaces String
        System.out.println(name.startsWith("Ras")); // if true returns true
        System.out.println(name.endsWith("Ras")); // if false returns false

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("sh")); // returns first string matching index

        String modifiedName = "Rashedshe";
        System.out.println(modifiedName.indexOf("she", 5));
        System.out.println(modifiedName.indexOf("dfk", 5)); //if String is not present then will return -1
        System.out.println(modifiedName.lastIndexOf("d"));

        System.out.println(name.equals("Rashed"));
        System.out.println(name.equalsIgnoreCase("rashed"));

        System.out.println("I am escaped sequence \t \" double quote");
    }
}
