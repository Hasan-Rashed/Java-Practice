package oop;

public class Teacher
{
    String name, gender;
    int phone;

    Teacher() // default parameterized constructor

    {
        System.out.println("This is a default parameterized constructor.");
    }

    Teacher(String n, String g, int p)
    {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation() // Normal method
    {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}
