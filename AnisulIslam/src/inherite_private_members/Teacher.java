package inherite_private_members;

public class Teacher extends Person
{
    // has already come setName, setAge, getName, getAge
    private String qualificatin;

    public void setQualificatin(String qualificatin)
    {
        this.qualificatin = qualificatin;
    }

    public String getQualificatin()
    {
        return qualificatin;
    }

    public void display()
    {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualificatin());
        System.out.println();
    }
}
