package array_demo;
import java.util.Scanner;

public class Array2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double [] number = new double[5];
        double sum = 0, max, min;

        System.out.print("Please Enter 5 numbers: ");

        for(int i = 0; i < number.length; i++)
        {
            number[i] = input.nextDouble();
            sum += number[i];
        }
        max = number[0];
        min = number[0];

        for(int i = 1; i < number.length; i++)
        {
            if(max <= number[i])
            {
                max = number[i];
            }
            if(min >= number[i])
            {
                min = number[i];
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum / number.length);
    }
}
