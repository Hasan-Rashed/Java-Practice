package static_keyword;

public class Student
{
    String name; // instance variable
    int id;      // instance variable
    static String universityName = "Britannia University"; // static / variable related to class

    Student(String n, int i)
    {
        name = n;
        id = i;
    }

    void displayInformation()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + universityName);
        System.out.println();
    }
}
