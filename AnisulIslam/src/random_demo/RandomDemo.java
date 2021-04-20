package random_demo;

import java.util.Random;

public class RandomDemo
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1; // 1 to 10
        System.out.println("Random number = " + randomNumber);

        int randomNumber2 = rand.nextInt(14) + 87; // 87 to 100
        System.out.println("Random number2 = " + randomNumber2);

        // Another way
        int randomNumber3 = (int) Math.random() * 10 + 1; // 1 to 10
        System.out.println("Random number3 = " + randomNumber3);
    }
}
