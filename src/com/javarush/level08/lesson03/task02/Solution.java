package com.javarush.level08.lesson03.task02;


/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> mapVeget = new HashMap<String, String>();
        mapVeget.put("арбуз", "ягода");
        mapVeget.put("банан", "трава");
        mapVeget.put("вишня", "ягода");
        mapVeget.put("груша", "фрукт");
        mapVeget.put("дыня", "овощ");
        mapVeget.put("ежевика", "куст");
        mapVeget.put("жень-шень","корень");
        mapVeget.put("земляника", "ягода");
        mapVeget.put("ирис", "цветок");
        mapVeget.put("картофель", "клубень");

        for(Map.Entry<String, String> pair : mapVeget.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}



