package method_overriding;

public class B extends A
{
    //int x = 10
    int x = 5;

    void display()
    {
        System.out.println(super.x);
    }
}
