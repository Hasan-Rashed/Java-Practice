package basic;
import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int rem, num, sum = 0, temp;
        System.out.print("Enter n: ");
        num = input.nextInt();
        temp = num;

        while(temp != 0)
        {
            rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if(sum == num)
        {
            System.out.print("Armstrong Number.");
        }
        else
        {
            System.out.print("Not Armstrong Number.");
        }
    }
}
