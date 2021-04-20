package string;

public class String6
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("Hasan");

        System.out.println("str: " + str);

        str.append(" Rashed");

        str.reverse();
        System.out.println("str: " + str);

        str.delete(2, 5);
        System.out.println("str: " + str);
    }
}
