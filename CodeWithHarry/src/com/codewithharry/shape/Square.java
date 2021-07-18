package com.codewithharry.shape;

import com.codewithharry.shape.Shape;

public class Square extends Shape
{
    Square(int dim1)
    {
        super(dim1, -1);
    }

    public int area()
    {
        return this.dim1 * this.dim1;
    }
}
