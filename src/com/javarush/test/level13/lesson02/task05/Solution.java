package com.javarush.test.level13.lesson02.task05;

/* 4 ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
Объявление интерфейсов не изменять.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {

        System.out.println(new Hobbie().toString());
        System.out.println(new Hobbie().toString());

    }

        interface Desire
        {
        }

        interface Dream
        {

        }

        static class Hobbie implements Desire, Dream
        {
            int INDEX = 1;
            Hobbie HOBBIE = new Hobbie();
            @Override
            public String toString()
            {
                INDEX++;
                return "" + INDEX;
            }
        }

}
