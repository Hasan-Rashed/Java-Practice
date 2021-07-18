package com.company;

interface MyCamera
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

interface MyWifi
{
    String [] getNetworks();
    void connectNetworks(String network);
}

class MyCellPhone
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

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera // can extends only one class
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
}

public class Cwh_57_interface_default_methods
{
    public static void main(String[] args)
    {
        MySmartPhone mySmartPhone = new MySmartPhone();
        String [] ar = mySmartPhone.getNetworks();

        mySmartPhone.record4kVideo();
        for (String item : ar)
        {
            System.out.println(item);
        }
    }
}
