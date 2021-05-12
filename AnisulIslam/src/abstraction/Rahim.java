package abstraction;

public class Rahim extends MobileUser
{
    //call, sendMessage()- overridden
    @Override
    void sendMessage()
    {
        System.out.println("Hi, I am Rahim.");
    }
}
