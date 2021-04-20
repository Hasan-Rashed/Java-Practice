package basic;
import java.util.Scanner;

public class Pattern2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int row, col, n;
        System.out.print("Enter n: ");
        n = input.nextInt();

        for(row = n; row >= 1; row--)
        {
            for(col = 1; col <= row; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
