package com.company;

interface MyCamera2
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning...");
    }
    default void record4kVideo()
    {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2
{
    String [] getNetworks();
    void connectNetworks(String network);
}

class MyCellPhone2
{
    void cellNumber(int phoneNumber)
    {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(int phoneNumber)
    {
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 // can extends only one class
{
    public void takeSnap()
    {
        System.out.println("Taking snap");
    }

    public void recordVideo()
    {
        System.out.println("Taking video");
    }

//    public void record4kVideo()
//    {
//        System.out.println("Taking snap and recording in 4k");
//    }

    public String [] getNetworks()
    {
        System.out.println("Getting List of Networks");
        String [] networkList = {"Harry", "Prashhhanth", "Anjali"};
        return networkList;
    }

    @Override
    public void connectNetworks(String network)
    {
        System.out.println("Connecting to network " + network);
    }

    public void sampleMath()
    {
        System.out.println("Math");
    }
}

public class Cwh_59_Polymorphism
{
    public static void main(String[] args)
    {
        MyCamera2 myCamera2 = new MySmartPhone2(); // This is a smartphone, use it as a camera
        //myCamera2.getNetworks(); // Not allowed
        //myCamera2.sampleMath(); // Not allowed

        myCamera2.record4kVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMath();
        s.record4kVideo();
        s.recordVideo();
        s.getNetworks();
        s.cellNumber(7979);
    }
}
