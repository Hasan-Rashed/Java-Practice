package list;
import java.util.LinkedList;

public class LinkedListDemo2
{
    public static void main(String[] args)
    {
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Afganistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(5, "Brazil"); // add method with two parameters
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");

//        countryNames.remove("Japan");
//        countryNames.remove(7);
//        countryNames.removeFirst();
//        countryNames.removeLast();

        for(String country : countryNames)
        {
            System.out.println(country);
        }

        System.out.println("Size of the LinkedList: " + countryNames.size());
        System.out.println("First element: " + countryNames.getFirst());
        System.out.println("First element: " + countryNames.getLast());

        countryNames.clear();
        System.out.println(countryNames);
    }
}
