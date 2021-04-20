package inheritance;

public class Test
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();

        t1.name = "Hasan Rashed";
        t1.age = 22;
        t1.qualification = "Msc in CSE";
        t1.displayInformation2();

        Teacher t2 = new Teacher();

        t2.name = "Kamrul Hasan";
        t2.age = 24;
        t2.qualification = "Bsc in CSE";
        t2.displayInformation2();
    }
}
