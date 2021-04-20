package string;

public class WrapperClass
{
    public static void main(String[] args)
    {
        // primitive -> object
        int x = 30;

        // Y is wrapper class Integer class object
        Integer y = x; // Integer.valueof(x) autoboxing
        System.out.println("y = " + y);

        // object -> primitive type
        Double d = new Double (10.25);
        System.out.println("d = " + d);
    }
}
