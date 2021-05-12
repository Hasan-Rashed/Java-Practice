package abstraction;

abstract public class MobileUser
{
    void call() // non-abstract method.
    {
        System.out.println("Call method.");
        System.out.println();
    }
    abstract void sendMessage(); //abstract method
}
