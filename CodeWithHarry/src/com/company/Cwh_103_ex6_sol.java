package com.company;

class InvalidInputException extends Exception
{
    @Override
    public String toString()
    {
        return "cannot add 8 and 9";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

class CannoDivideByZeroException extends Exception
{
    @Override
    public String toString()
    {
        return "Cannot divide by zero";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

class MaxInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Input cannot be greater than 100000";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

class MaxMultiplyInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Input cannot be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

class CustomCalculator
{
    double add(double a, double b) throws InvalidInputException, MaxInputException
    {
        if (a > 100000 || b > 100000)
        {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9)
        {
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b) throws MaxInputException
    {
        if (a > 100000 || b > 100000)
        {
            throw new MaxInputException();
        }
        return a - b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException
    {
        if (a > 100000 || b > 100000)
        {
            throw new MaxInputException();
        }

        else if (a > 7000 || b > 7000)
        {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CannoDivideByZeroException, MaxInputException
    {
        if (a > 100000 || b > 100000)
        {
            throw new MaxInputException();
        }

        if (b == 0)
        {
            throw new CannoDivideByZeroException();
        }
        return a / b;
    }

}

public class Cwh_103_ex6_sol
{
    public static void main(String[] args) throws InvalidInputException, CannoDivideByZeroException, MaxInputException
    {
        CustomCalculator c = new CustomCalculator();
        //c.add(8, 9);
        //c.divide(6,0);
        //c.divide(600000000, 40);
        //c.multiply(5, 7000);
    }
}