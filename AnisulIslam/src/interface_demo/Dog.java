package interface_demo;

public class Dog implements Animal // if a class inheritance a interface then must be write implements.
{
    @Override
    public void eat()
    {
        System.out.println("Dogs can eat egg.");
    }
}
