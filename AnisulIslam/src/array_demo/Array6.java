package array_demo;

public class Array6
{
    public static void main(String[] args)
    {
        int [][] number = new int [4][5];
        int count = 0;

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                number[i][j] = count++;
                System.out.print(number[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
