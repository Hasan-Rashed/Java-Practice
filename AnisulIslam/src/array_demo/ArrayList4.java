package array_demo;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4
{
    public static void main(String[] args)
    {
        ArrayList <Integer> number = new ArrayList <Integer> ();

        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);

        System.out.println("Before sorting: " + number);

        Collections.sort(number);
        System.out.println("After sorting in ascending: " + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After sorting in decending: " + number);
    }
}
