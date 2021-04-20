package overloading_constructor;

public class OverloadingConstructorTest
{
    public static void main(String[] args)
    {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Hasan Rashed", "Male");
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Lisa", "Female", 832407);
        teacher3.displayInformation();
    }
}
