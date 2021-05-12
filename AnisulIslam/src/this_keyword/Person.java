package this_keyword;

public class Person
{
    String name; // instance variable
    int age; // instance variable
    String hairColor;

    Person(String name, int age) //name, age local variable
    {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String hairColor)
    {
        this(name, age); // no need to declare name of constructor.
        this.hairColor = hairColor;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hair color: " + hairColor);
        System.out.println();
    }
}
