package super_keyword;

public class Car extends Vehicle
{
    //color, weight, attribute()
    int gear;

    Car(String c, double w, int g)
    {
        super(c, w); // Calling constructor of vehicle class
        gear = g;
    }

    @Override
    void attribute() {
        super.attribute(); // calling vehicle classes attribute
        System.out.println("Gear: " + gear);
    }
}
