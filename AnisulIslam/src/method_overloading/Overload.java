package method_overloading;

public class Overload // same method name is called Polymorphism
{
    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    void add(double a, double b)
    {
        System.out.println(a + b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    void add()
    {
        System.out.println("Nothig to add");
    }
}
