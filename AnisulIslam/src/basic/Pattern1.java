package basic;
import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter line number: ");

        int n, row, col;
        n = input.nextInt();

        for(row = 1; row <= n; row++)
        {
            for(col = 1; col <= row; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
