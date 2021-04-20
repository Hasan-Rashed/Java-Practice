package problems_solving;

public class Box
{
    double height, width, depth; // instance variable

    Box(double height, double width, double depth) // local variable
    {
        this.height = height; // assigning local variable to instance variable as same name using this keyword. local variable has priority than instance
        this.width = width;
        this.depth = depth;
    }

    void displayVol()
    {
        double vol = height * width * depth;
        System.out.println("Volume is: " + vol);
    }
}
