package com.javarush.test.level24.lesson14.big01;

/**
 * Created by Andriana_Yarmoliuk on 8/17/2016.
 */
public class Canvas
{
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public char[][] getMatrix()
    {
        return matrix;
    }

    public void setMatrix(char[][] matrix)
    {
        this.matrix = matrix;
    }

    public void setPoint(double x, double y, char c){

    }

    public void drawMatrix(double x, double y, int[][] matrix, char c){

    }
}