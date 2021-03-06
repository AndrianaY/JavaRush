package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map1 = new HashMap<String, Cat>();

        map1.put("Murzik", new Cat("Murzik"));
        map1.put("Barsik", new Cat("Barsik"));
        map1.put("Bobik", new Cat("Bobik"));
        map1.put("Vaska", new Cat("Vaska"));
        map1.put("Petjka", new Cat("Petjka"));
        map1.put("Masha", new Cat("Masha"));
        map1.put("Pasha", new Cat("Pasha"));
        map1.put("Kotja", new Cat("Kotja"));
        map1.put("Vitja", new Cat("Vitja"));
        map1.put("Fedja", new Cat("Fedja"));
        return map1;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set1 = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            set1.add(pair.getValue());
        }
        return set1;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
