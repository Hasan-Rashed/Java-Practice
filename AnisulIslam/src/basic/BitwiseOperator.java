package basic;

public class BitwiseOperator
{
    public static void main(String[] args)
    {
        int a = 32, b = 12, c;

        c = a & b; // binary multiplication of a and b
        System.out.println("a & b: " + c);

        c = a | b; // binary addition of a and b
        System.out.println("a | b: " + c);

        c = a ^ b;
        System.out.println("a ^ b: " + c);

        c = a >> 3;
        System.out.println("a >> 3: " + c);

        c = a << 3;
        System.out.println("a << 3: " + c);
    }
}
