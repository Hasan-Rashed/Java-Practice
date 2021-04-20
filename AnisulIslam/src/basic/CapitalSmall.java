package basic;
import java.util.Scanner;

public class CapitalSmall
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char ch;

        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') // a -> z
        {
            System.out.print("Small Letter");
        }

        else if(ch >= 'A' && ch <= 'Z') // A -> Z
        {
            System.out.print("Capital Letter");
        }
        else
        {
            System.out.print("Not a letter");
        }
    }
}
