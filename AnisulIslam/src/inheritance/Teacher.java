package inheritance;

public class Teacher extends Person
{
    // name, int , displayInformation()
    String qualification;

    void displayInformation2()
    {
        displayInformation1();
        System.out.println("Qualificaion: " + qualification);
        System.out.println();
    }
}
