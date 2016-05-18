package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Andriana_Yarmoliuk on 3/29/2016.
 */
public class Singleton
{
    private final static Singleton value = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){return value;}
}
