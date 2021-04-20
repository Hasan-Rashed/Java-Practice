package basic;
import java.util.Scanner;

public class Pattern11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n, row, col, count = 1;
        System.out.print("Enter N: ");
        n = input.nextInt();

        for(row = 1; row <= n; row++)
        {
            for(col = 1; col <= row; col++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
