package com.javarush.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Ван дам", new Date("JULY 1 1980"));
        map.put("Шварц", new Date("AUGUST 1 1980"));
        map.put("Чан", new Date("OCTOBER 1 1980"));
        map.put("Вилис", new Date("MARCH 1 1980"));
        map.put("Норрис", new Date("APRIL 1 1980"));
        map.put("Лунгрен", new Date("SEPTEMBER 1 1980"));
        map.put("Стэтэм", new Date("NOVEMBER 1 1980"));
        map.put("Бандэрос", new Date("DECEMBER 1 1980"));
        map.put("Никулин", new Date("JUNE 1 1980"));
        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            Date date = map.get(str);

            if (date.getMonth()>=5 && date.getMonth() <= 7)

            {
                iter.remove();
            }
        }



    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        for (Map.Entry<String, Date> k: map.entrySet())
        {
            System.out.println(k.getKey() + k.getValue());
        }
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> k: map.entrySet())
        {
            System.out.println(k.getKey() + k.getValue());
        }
    }
}
