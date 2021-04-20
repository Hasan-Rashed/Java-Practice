package oop;

public class CallByValueReference
{
    String name;
    void change(CallByValueReference r2)
    {
        r2.name = "Rashed";
    }
}
