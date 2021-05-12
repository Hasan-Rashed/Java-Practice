package type_casting;

public class Test 
{
    public static void main(String[] args)
    {
        Person p = new Teacher(); // Type casting to keep subclasses object to superclass called Upcasting.
        p.display();

        Teacher t = (Teacher) new Person(); // Type casting to keep superclasses object to subclass called down casting but it works properly in compile time but error in run time.
        t.display();
    }
}
