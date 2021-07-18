package com.company;

class Employee
{
    int id;
    String name;
    int salary;

    public void printDetailes()
    {
        System.out.println("My id is: " + id);
        System.out.println("and my name is: " + name);
    }

    public int getSalary()
    {
        return salary;
    }
}

public class Cwh_38_custom_class
{
    public static void main(String[] args)
    {
        System.out.println("This is our custom class");

        Employee rashed = new Employee(); // instantiating a new Employee object.
        Employee john = new Employee(); // instantiating a new Employee object.

        // setting attributes for rashed
        rashed.id = 12;
        rashed.salary = 34;
        rashed.name = "CodeWithRashed";

        // setting attributes for john
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        //printing attributes
//       System.out.println(rashed.id);
//       System.out.println(rashed.name);

        rashed.printDetailes();
        john.printDetailes();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
