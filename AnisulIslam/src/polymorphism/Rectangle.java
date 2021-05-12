package polymorphism;

public class Rectangle extends Shape
{
    // area
    double length, width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    double area()
    {
        System.out.print("Rectangle area: ");
        return length * width;
    }
}
