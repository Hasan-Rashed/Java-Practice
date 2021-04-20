package static_variable;

public class Test
{
    public static void main(String[] args)
    {
        StaticVariable ob = new StaticVariable();

        System.out.println("Name: " + ob.name); // non-static function needed object
        System.out.println("Name: " + StaticVariable.universityName); // static function related with class

    }
}
