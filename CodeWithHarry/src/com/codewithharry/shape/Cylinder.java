package com.codewithharry.shape;

import com.codewithharry.shape.Shape;

public class Cylinder extends Shape
{
    Cylinder(int dim1)
    {
        super(dim1, -1);
    }

    public double area()
    {
        return 2 * Math.PI * this.dim1 * (this.dim1 + this.dim1);
    }
}
