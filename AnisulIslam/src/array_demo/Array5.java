package array_demo;
import java.util.Scanner;

public class Array5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int [][] A = new int [2][3];
        int [][] B = new int [2][3];
        int [][] C = new int [2][3];

        // getting input forA input.
        System.out.println("Enter Elements for A Matrisx: ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.print("A[" + row + "][" + col + "]: ");
                A[row][col] = input.nextInt();
            }
        }
        // getting input for B input.
        System.out.println("Enter Elements for B Matrix: ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.print("B[" + row + "][" + col + "]: ");
                B[row][col] = input.nextInt();
            }
        }
        //printing A matrix
        System.out.print("A: ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.print("\t" + A[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //printing B matrix
        System.out.println("B: ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.print("\t" + B[row][col] + " ");
            }
            System.out.println();
        }

        //adding and printing A and B matrix
        System.out.println("\nC = A + B: ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                C[row][col] = A[row][col] + B[row][col];
                System.out.print("\t" + C[row][col] + " ");
            }
            System.out.println();
        }

//		for(int row = 0; row < 2; row++)
//		{
//			for(int col = 0; col < 3; col++)
//			{
//			}
//		}
    }
}
