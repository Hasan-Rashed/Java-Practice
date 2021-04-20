package static_variable1;

public class Student
{
    static int count = 0; // non static variable

    Student()
    {
        count++;
    }

    void totalStudent()
    {
        System.out.println("Total Student: " + count);
    }
}
