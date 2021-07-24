package com.company;

@FunctionalInterface
interface DemoAno
{
    void math1(int a);
    //void math2();
}

//class HarryFunc implements DemoAno
//{
//    @Override
//    public void math1()
//    {
//        System.out.println("This is method1");
//    }
//}

//class AnnonyDemo implements DemoAno
//{
//    public void display()
//    {
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void math1()
//    {
//        System.out.println("I am Math1");
//    }
//
//    @Override
//    public void math2()
//    {
//        System.out.println("I am Math2");
//
//    }
//}
public class Cwh_109_lamda
{
    public static void main(String[] args)
    {
//        AnnonyDemo object = new AnnonyDemo();
//        object.math1();

        // Anonymous class
//        DemoAno obj = new DemoAno()
//        {
//            @Override
//            public void math1()
//            {
//                System.out.println("I am Math1");
//            }
//
//            @Override
//            public void math2()
//            {
//                System.out.println("I am Math2");
//            }
//        };
//        obj.math1();

        // Lambda Expression
//        DemoAno obj = new HarryFunc();
//        obj.math1();

        DemoAno obj = (a)->
        {
            System.out.println("I am method 1 from this lambda" + a);
        };
        obj.math1(6);
    }
}
