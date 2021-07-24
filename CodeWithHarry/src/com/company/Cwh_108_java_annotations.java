package com.company;

@FunctionalInterface
interface MyFunctionalInterface
{
    void thisMethod();
}

class NewPhone extends Phone
{
    @Override
    public void showTime()
    {
        System.out.println("Time is 8 PM");
    }

    @Deprecated
    public int sum(int a, int b)
    {
        return a + b;
    }
}

public class Cwh_108_java_annotations
{
    @SuppressWarnings("deprecated")
    public static void main(String[] args)
    {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}
