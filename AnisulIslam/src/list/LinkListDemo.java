package list;
import java.util.LinkedList;

public class LinkListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Afganistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");

        System.out.println(countryNames);
    }
}
