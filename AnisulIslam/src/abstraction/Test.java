package abstraction;

public class Test
{
    public static void main(String[] args)
    {
        MobileUser mu; // mu is Reference variable.
        mu = new Rahim();
        mu.sendMessage();
        mu.call();

        mu = new Karim();
        mu.sendMessage();
        mu.call();
    }
}
