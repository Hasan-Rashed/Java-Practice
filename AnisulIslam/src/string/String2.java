package string;

public class String2
{
    public static void main(String[] args)
    {
        String firstName = "Hasan";
        String lastName = " Rashed";

        String fullName = firstName + lastName;
        System.out.println(fullName);

        fullName = firstName.concat(lastName);
        System.out.println(fullName);

        String upperName = fullName.toUpperCase();
        System.out.println(upperName);

        String lowerName = fullName.toLowerCase();
        System.out.println(lowerName);

        boolean b = firstName.startsWith("H");
        System.out.println(b);

        boolean last = lastName.endsWith("m");
        System.out.println(last);

        String [] names = {"hasan", "rashed", "niloy"};

        for(String x : names)
        {
            System.out.print(x  + " ");
        }
    }
}
