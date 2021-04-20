package method_overriding;

public class Teacher extends Person
{
    //name, age, display
    String qualificaion;

    @Override
    void displayInformaion() // Overriding displayInformaion method
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualificaion);
        System.out.println();
    }
}
