package encaptulation;

public class EncapsulationTest
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setName("Hasan");
        p1.setAge(22);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
