package method_overriding;

public class Test
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();
        t1.name = "Hasan";
        t1.age = 27;
        t1.qualificaion = "Bsc in CSE.";

        t1.displayInformaion();

        Person p = new Teacher();
        p.name = "Rashed";
        p.age = 22;

        p.displayInformaion();
    }
}
