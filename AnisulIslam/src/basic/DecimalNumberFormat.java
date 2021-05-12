package basic;

public class DecimalNumberFormat
{
    public static void main(String[] args)
    {
        DecimalNumberFormat ob = new DecimalNumberFormat();
        double x = 2.343454554;
        System.out.printf("x = %.2f", x); // c programming style.
        System.out.println(String.format("x = " + ob, x));
    }
}
