package basic;
import java.util.Scanner;

public class SumOfConsecutiveNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int sum = 0, m, n, even = 0;

        System.out.print("Enter initial number: ");
        m = input.nextInt();

        System.out.print("Enter final number: ");
        n = input.nextInt();

        for(int i = m; i <= n; i++)
        {
            sum += i;
        }

        System.out.println("Sum is: " + sum);

        for(int i = m; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
                even += i;
            }
        }

        System.out.println("\nSum Of Even numbers is: " + even);
    }
}
