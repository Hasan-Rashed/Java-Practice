package others;

public class Test
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Hasan", 22);
        Person p2 = new Person("Rashed", 23);

        System.out.println(p1); //automatically called toString method
        System.out.println(p2); //automatically called toString method

    }
}
