package abstraction;

public class Karim extends MobileUser
{
    //call, sendMessage()- overridden
    @Override
    void sendMessage()
    {
        System.out.println("Hi, I am Karim.");
    }
}
