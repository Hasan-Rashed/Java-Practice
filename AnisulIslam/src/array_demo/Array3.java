package array_demo;

public class Array3
{
    public static void main(String[] args)
    {
        String [] names = {"Kamrul", "Hasan", "Mazumder", "Rashed"};
        int [] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        System.out.println("Length of string: " + names.length);
        for(String x : names) //for each loop
        {
            System.out.println(x);
        }

        System.out.println("Length of int: " + num.length);
        for(int x : num)
        {
            System.out.println(x);
            sum += x;
        }
        System.out.println(sum);
    }
}
