package static_method;

public class Test
{
    public static void main(String [] args)
    {
        StaticMethod ob1 = new StaticMethod();
        ob1.display1();

        StaticMethod.display2(); // to use static method no need to create a object
    }
}
