package string;

public class String5
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hasan");

        System.out.println(sb);

        sb.append(" Rashed ");
        sb.append(25);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);

    }
}
