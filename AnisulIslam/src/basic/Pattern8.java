package basic;
import java.util.Scanner;

public class Pattern8
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
                if(row == 1 || row == n || col == 1 || col == n)
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
