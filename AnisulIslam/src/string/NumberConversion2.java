package string;

public class NumberConversion2
{

    public static void main(String[] args)
    {

        // Decimal to different
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);

        decimal = 15;
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);

        decimal = 15;
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println(hexadecimal);
    }
}
