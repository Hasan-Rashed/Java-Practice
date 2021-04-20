package basic;
import java.util.Scanner;

public class Pattern10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n, row, col;
        System.out.print("Enter N: ");
        n = input.nextInt();

        for(row = 1; row <= n; row++)
        {
            for(col = 1; col <= n; col++)
            {
                if(row == col || row + col == n + 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
