package final_keyword;

public class University
{
    final String UNIVERSITY_NAME = "Britannia University";
    final int id = 19;
    final int fees; /* blank final variable must be initialized with a constructor. */
    static final int age; /* static blank final variable must be initialized static block */
    University()
    {
        fees = 312000;
    }

    static
    {
        age = 22;
    }
    void display()
    {
        System.out.println(UNIVERSITY_NAME);
        System.out.println(id);
        System.out.println(fees);
    }
}
