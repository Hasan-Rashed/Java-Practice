package basic;
import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, count = 0, first = 0, second = 1, fibo;

        System.out.print("Enter N: ");
        n = input.nextInt();

        System.out.print(first + " " + second + " ");
        for(int i = 0; i < n - 2; i++)
        {
            fibo = first + second;
            first = second;
            second = fibo;

            System.out.print(fibo + " ");
            count++;
        }
    }
}
