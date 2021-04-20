package array_demo;
import java.util.ArrayList;

public class ArrayList2
{
    public static void main(String[] args)
    {
        ArrayList <Integer> number  = new ArrayList <Integer> ();

        System.out.println("size: " + number.size());

        number.add(12);
        number.add(22);
        number.add(32);
        number.add(42);
        number.add(4, 52);

        System.out.println("ArrayList: " + number);
        System.out.println("ArrayList size: " + number.size());

        boolean contain = number.contains(32); //contain method check whether a number is in the arraylist or not.
        System.out.println("\n32 is in the list: " + contain);

        int pos = number.indexOf(42);
        System.out.println("The index of 42 is: " + pos);

        number.set(3, 62); //replace existing value of this index.
        System.out.println("\nArrayList: " + number);

        int num = number.get(0);
        System.out.println("index 0: " + num);

        number.clear();
        System.out.println("\nArrayList: " + number);

        boolean check = number.isEmpty();
        System.out.println("arraylist empty: " + check);
    }
}
