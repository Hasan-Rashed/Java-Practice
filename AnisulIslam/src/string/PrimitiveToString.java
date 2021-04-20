package string;

public class PrimitiveToString
{
    public static void main(String[] args)
    {
        // primitive to string
        int x = 100;
        String s = Integer.toString(x);

        System.out.println("s = " + s);

        boolean b = true;
        String s1 = Boolean.toString(b);
        System.out.println(s1);

        //string to primitive
        String s2 = "32";
        int i = Integer.parseInt(s2);
        System.out.println("i = " + i);

        String s3 = "32";
        int j = Integer.valueOf(s2);
        System.out.println("j = " + j);
    }
}
