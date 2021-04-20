package array_demo;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1
{

    public static void main(String[] args)
    {
        ArrayList <Integer> number = new ArrayList <> ();

        System.out.println("size: " + number.size());

        // adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        //two ways to print arrayList
        System.out.println(number); //first way

        // for each looop
        for(int i : number) //second way
        {
            System.out.print(i + " ");
        }

        System.out.println("\nsize: " + number.size());


        // Removing elements
        number.remove(2);
        System.out.println("After removing ArrayList: " + number);

        number.removeAll(number);
        System.out.println("After removing all ArrayList: " + number);
    }
}
