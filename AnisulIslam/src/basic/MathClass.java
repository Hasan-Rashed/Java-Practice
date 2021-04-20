package basic;

public class MathClass
{
    public static void main(String[] args)
    {
        int x = 20, y = -10, max, min, absolute;

        max = Math.max(x, y);
        min = Math.min(x, y);
        absolute = Math.abs(y);

        int a = 4, b = 5;
        double power = Math.pow(a, b);
        int round = Math.round(8.8f);
        double pi = Math.PI;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Absolute of y: " + absolute);
        System.out.println("Power of x over y: " + power);
        System.out.println("Round of 8.8f: " + round);
        System.out.println("Value of pi: " + pi);
    }
}
