package com.javarush.level15.lesson12.home05;

/**
 * Created by Andriana_Yarmoliuk on 4/19/2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(int i)
    {
        super(i);
    }

    public SubSolution(String s)
    {
        super(s);
    }

    public SubSolution(double d)
    {
        super(d);
    }

    protected SubSolution(int i, String s)
    {
        super(i, s);
    }

    protected SubSolution(String s, int i)
    {
        super(s, i);
    }

    protected SubSolution(double d, int i)
    {
        super(d, i);
    }

    SubSolution(Object a)
    {
        super(a);
    }

    SubSolution(int i, String s, double d)
    {
        super(i, s, d);
    }

    SubSolution(String s, double d, Integer k)
    {
        super(s, d, k);
    }

    private SubSolution(int i, double d, String s){
        super(i);

    }

    private SubSolution(int i, double d, String s, int k){
        super(i);
    }

    private SubSolution(double d, String s){
        super(d);
    }

}
