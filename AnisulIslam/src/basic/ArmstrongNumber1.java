package basic;
import java.util.Scanner;

public class ArmstrongNumber1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int temp, num, rem, sum = 0;
        System.out.print("Enter the last Number: ");
        num = input.nextInt();

        for(int i = 1; i <= num; i++)
        {
            temp = i;
            while(temp != 0)
            {
                rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }
            if(sum == i)
            {
                System.out.print(i + " Armstrong Number.\n");
            }
            sum = 0;
        }
    }
}
