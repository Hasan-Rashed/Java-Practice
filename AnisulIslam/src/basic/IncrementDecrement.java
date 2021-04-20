package basic;

public class IncrementDecrement
{
    public static void main(String[] args)
    {
        int x = 25, y;

        y = x++; // post increment
        y = ++x; // post increment
        System.out.println("Y = " + y);

        // x = 27
        y = x--; // post decrement
        y = --x; // post decrement
        System.out.println("Y = " + y);
    }
}
