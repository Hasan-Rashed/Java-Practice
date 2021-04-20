package basic;
import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n, m;
        System.out.print("Enter initial number: ");
        m = input.nextInt();

        System.out.print("Enter final number: ");
        n = input.nextInt();

        for(int i = m; i <= n; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
