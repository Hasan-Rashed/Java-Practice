package oop;

public class Test
{
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher("Hasan Rashed", "Male", 1884135530);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Kamrul Hasan", "Male", 1866708786);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();

    }
}
