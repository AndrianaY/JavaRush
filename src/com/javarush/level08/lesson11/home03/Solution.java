package com.javarush.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> map = new HashMap<>();
        map.put("qwe", "asd");
        map.put("qwe", "asddgfs");
        map.put("qwe", "asdrtg");
        map.put("qwe", "asrtgd");
        map.put("qwe", "artghsd");
        map.put("qwe", "arwtyghsd");
        map.put("qtyhnjwe", "asd");
        map.put("qtyjwe", "asd");
        map.put("qwryjuke", "asd");
        map.put("qrtyjuwe", "asd");

        //напишите тут ваш код

        return map;
    }



    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
