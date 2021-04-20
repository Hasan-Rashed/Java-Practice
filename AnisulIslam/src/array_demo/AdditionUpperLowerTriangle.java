package array_demo;
import java.util.Scanner;

public class AdditionUpperLowerTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int [][] A = new int [3][3];
        int diagonal = 0, upper = 0, lower = 0;

        //Matrix input
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                A[row][col] = input.nextInt();
            }
        }

        //diagonal, upper, lower
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                if(row == col)
                {
                    diagonal += A[row][col];
                }

                if(row < col)
                {
                    upper += A[row][col];
                }

                if(row > col)
                {
                    lower += A[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal element: " + diagonal);
        System.out.println("Sum of upper triangle: " + upper);
        System.out.println("Sum of lower triangle: " + lower);
    }
}
