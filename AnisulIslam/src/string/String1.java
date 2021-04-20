package string;

public class String1
{
    public static void main(String[] args)
    {
        String s1 = "Hasan Rashed";
        String s2 = new String("hasan Rashed");

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);

        int len = s1.length();
        System.out.println("Length of s1: " + len);

        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("not equal");
        }

        boolean con = s1.contains("Rashed");
        System.out.println(con);

        boolean b = s1.isEmpty();
        System.out.println("b: " + b);
    }
}
