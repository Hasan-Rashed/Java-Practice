package modifier2;
import modifier1.A;

public class C extends A
{
    public static void main(String[] args)
    {
        A ob = new A(); // Using display method from modifier1 package using public modifier.
        ob.display();

        C ob2 = new C(); // Using display2 method from modifier1 package using protected modifier and inherit the A class in subClass C.
        ob2.display2();
    }
}
