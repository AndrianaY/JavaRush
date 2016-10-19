package com.javarush.level24.lesson14.big01;

/**
 * Created by Andriana_Yarmoliuk on 8/16/2016.
 */
public class Stand extends BaseObject
{
    private final double direction; //по x: 1 - вправо, -1 - влево)
    private double speed;
    public Stand(double x, double y)
    {
        super(x,y,3);
        speed = 1;
        direction = 0;
    }

    @Override
    public void draw(Canvas canvas)
    {

    }

    @Override
    public void move()
    {

    }

    public double getDirection()
    {
        return direction;
    }

    public double getSpeed()
    {
        return speed;
    }
}
