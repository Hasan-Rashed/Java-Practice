package oop;

public class RecursiveFactorial
{
    int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args)
    {
        RecursiveFactorial ob = new RecursiveFactorial();
        System.out.println("Factorial of 5: " + ob.fact(5));

        System.out.println("Factorial of 7: " + ob.fact(7));

        System.out.println("Factorial of 1: " + ob.fact(1));
    }
}
