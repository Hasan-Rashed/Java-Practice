package array_demo;
import java.util.Arrays;

public class Array8
{
    public static void main(String[] args)
    {
        int [] number = {10, -3, 18, 5, 25};

        Arrays.sort(number);

        System.out.print("Ascending: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(number[i] + " ");
        }


        System.out.print("\nAscending: ");
        for(int i = 4; i >= 0; i--)
        {
            System.out.print(number[i] + " ");
        }

        System.out.println();
        String[] names = {"Eamal", "Damal", "Cajon", "Bulkar", "Aashed"};

        Arrays.sort(names);
        System.out.print("Ascending: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(names[i] + " ");
        }

        System.out.print("\nDescending: ");
        for(int i = 4; i >= 0; i--)
        {
            System.out.print(names[i] + " ");
        }
    }
}
