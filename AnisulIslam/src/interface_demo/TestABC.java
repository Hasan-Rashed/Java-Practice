package interface_demo;

public class TestABC
{
    public static void main(String[] args)
    {
        C ob = new C(); // we can create object of class but not interface, like A and B interface.
        ob.play();
    }
}
