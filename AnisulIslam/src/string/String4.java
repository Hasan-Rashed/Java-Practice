package string;

public class String4
{
    public static void main(String[] args)
    {
        String s1 = "This_is_my_country.";

        String s2 = s1.replace('i', 'j');
        System.out.println(s2);
        System.out.println(s1);

        String [] s3 = s1.split("_"); // split the sentence where it get underscore sign
        for(String x : s3)
        {
            System.out.println(x);
        }
    }
}
