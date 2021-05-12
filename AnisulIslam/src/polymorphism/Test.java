package polymorphism;
//run time polymorphism
public class Test
{
    public static void main(String[] args)
    {
        Person p = new Person(); // p is the reference variable of super Person class
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();
    }
}
