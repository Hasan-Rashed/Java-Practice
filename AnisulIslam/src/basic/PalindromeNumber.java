package basic;
import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num, temp, sum = 0, rem;

        System.out.print("Enter the number: ");
        num = input.nextInt();

        temp = num;
        while(temp != 0)
        {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        if(sum == num)
        {
            System.out.println("Palindrome.");
        }
        else
        {
            System.out.println("Not a Palindrome.");
        }
    }
}
