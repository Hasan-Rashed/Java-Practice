package static_method;

public class StaticMethod
{
    static int x = 10;
    static void display1() // non static method
    {
        System.out.println("I am non static method");
    }

    static void display2() // static method
    {
        System.out.println("x: " + x);
        System.out.println("I am static method");
    }
}
