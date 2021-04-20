package basic;
import java.util.Scanner;

public class Pattern12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n, row, col;
        System.out.print("Enter N: ");
        n = input.nextInt();

        for(row = 1; row <= n; row++)
        {
            for(col = 1; col <= n - row; col++)
            {
                System.out.print(" ");
            }
            for(col = 1; col <= row; col++)
            {
                System.out.print(col);
            }
            for(col = row - 1; col >= 1; col--)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        for(row = n - 1; row >= 1; row--)
        {
            for(col = 1; col <= n - row; col++)
            {
                System.out.print(" ");
            }
            for(col = 1; col <= row; col++)
            {
                System.out.print(col);
            }
            for(col = row - 1; col >= 1; col--)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
