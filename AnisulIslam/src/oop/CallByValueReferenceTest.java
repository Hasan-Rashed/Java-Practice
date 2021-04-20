package oop;

public class CallByValueReferenceTest
{
    public static void main(String[] args)
    {
        CallByValueReference r1 = new CallByValueReference();
        r1.name = "Hasan";
        System.out.println("Before calling: " + r1.name);

        r1.change(r1);
        System.out.println("After calling: " + r1.name);

    }
}
