package string;

public class NumberConversion
{
    public static void main(String[] args)
    {
        // different to decimal
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);

        String octal = "675";
        decimal = Integer.parseInt(octal, 8);
        System.out.println(decimal);

        String hexadecimal = "AB6";
        decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal);

    }
}
