package others;

public class StringComparison
{
    public static void main(String[] args)
    {
        String password1 = "rashed12" ;
        String password2 = "rashed12";
        String password3 = new String("rashed12");
        String password4 = new String("rashed12");

        // Use of equal operator.
        System.out.println("Use of equal operator: ");
        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password3 == password4);

        // Use of equal method operator.
        System.out.println("Use of equal method: ");
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
    }
}
