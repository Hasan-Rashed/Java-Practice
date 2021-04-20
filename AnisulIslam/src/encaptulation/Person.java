package encaptulation; // in encaptulation we have to use private keyword and setter and getter method

public class Person
{
    private String PersonName;
    private int PersonAge;

    public void setName(String name)
    {
        PersonName = name;
    }

    public String getName()
    {
        return PersonName;
    }

    public void setAge(int age)
    {
        PersonAge = age;
    }

    public int getAge()
    {
        return PersonAge;
    }
}
