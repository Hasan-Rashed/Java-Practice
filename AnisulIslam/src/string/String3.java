package string;

public class String3
{
    public static void main(String[] args)
    {

        String country = "Bangladesh is my country";
        System.out.println(country);

        String name = "		Hasan rashed	";
        String s3 = name.trim(); // removes all space of beginning and in end
        System.out.println(s3);

        char ch = country.charAt(0);
        System.out.println("ch: " + ch);

        int value = country.codePointAt(0);
        System.out.println("value: " + value);

        int pos = country.indexOf('g');
        System.out.println("first positioin of g: " + pos);

        pos = country.lastIndexOf('n');
        System.out.println("last position of n: " + pos);
    }
}
