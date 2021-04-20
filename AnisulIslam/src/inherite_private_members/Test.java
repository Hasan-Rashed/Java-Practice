package inherite_private_members;

public class Test
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();
        t1.setName("Hasan");
        t1.setAge(22);
        t1.setQualificatin("Bsc in CSE.");
        t1.display();

        Teacher t2 = new Teacher();
        t2.setName("Rashed");
        t2.setAge(25);
        t2.setQualificatin("Bcom in BBA.");
        t2.display();
    }
}
