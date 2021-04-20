package basic;
import java.util.Scanner;

public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int row, col, n;

        System.out.print("Enter N: ");
        n = input.nextInt();

        for(row = 1; row <= n; row++)
        {
            for(col = 1; col <= row; col++)
            {
                System.out.print(row * col + " ");
            }
            System.out.println();
        }
    }
}
