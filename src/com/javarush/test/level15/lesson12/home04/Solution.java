package com.javarush.test.level15.lesson12.home04;

/* Закрепляем Singleton pattern
1. Найти в гугле пример для - Singleton pattern Lazy initialization.
2. По образу и подобию в отдельных файлах создать три синглтон класса Sun, Moon, Earth.
3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.javarush.test.level15.lesson12.home04.Planet.EARTH;
import static com.javarush.test.level15.lesson12.home04.Planet.MOON;
import static com.javarush.test.level15.lesson12.home04.Planet.SUN;

public class Solution {
    public static Planet thePlanet;
    static{

        readKeyFromConsoleAndInitPlanet();

    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try
        {
            s = bufferedReader.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        if(s.equals(SUN))
            thePlanet = Sun.getInstance();
        else if(s.equals(MOON))
            thePlanet = Moon.getInstance();
        else if(s.equals(EARTH))
            thePlanet = Earth.getInstance();
        else
            thePlanet = null;


    }
}
