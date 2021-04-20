package basic;
import java.util.Scanner;

public class SumOfDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num, temp, sum = 0, rem;

        System.out.print("Enter Number: ");
        num = input.nextInt();
        temp = num;

        while(temp != 0)
        {
            rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        System.out.println("Sum of digit: " + sum);
    }
}
