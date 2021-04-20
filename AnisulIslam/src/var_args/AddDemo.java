package var_args;

public class AddDemo
{
    void add(int ... num) // meaning of three dot can receive any length of argument num is variable name like array.
    {

        int sum = 0;
        for(int x : num)
        {
            sum += x;
        }
        System.out.println(sum);
    }
}
