package basic;
public class DataType
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        boolean b = true; // dynamic initialization
        char c = 'a';
        short s = 32677;
        int i = 126587;
        float f = 10.2f;
        double d = 10.2;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);


        // By using format specifier
        System.out.printf("Boolean b = %b\n", b);
        System.out.printf("Character c = %c\n", c);
        System.out.printf("Short b = %d\n", s);
        System.out.printf("Integer b = %d\n", i);
        System.out.printf("Float b = %.2ff\n", f);
        System.out.printf("Double b = %.3f\n", d);
    }
}
