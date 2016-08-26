package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();

        map.put("rrtygfrg", "drtfgrtrgh");
        map.put("rtyhjgfrg", "drtfgrtrgh");
        map.put("rgu,frg", "drtfgrtrgh");
        map.put("rgutkifrg", "drtfgrtrgh");
        map.put("rghmnjgfrg", "drtfgrtrgh");
        map.put("rgfkj,rg", "drtfgrtrgh");
        map.put("rymkgfrg", "drtfgrtrgh");
        map.put("rgfrymjumg", "drtfgrtrgh");
        map.put("rghjmghfrg", "drtfgrtrgh");
        map.put("rgfh,mrg", "drtfgrtrgh");

            //напишите тут ваш код
        return map;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int countName = 0;
        for (Map.Entry<String, String> m: map.entrySet())
        {
            if(m.getValue().equals(name)){
                countName++;
            }
        }
        return countName;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {

        int countLastName = 0;
        for (Map.Entry<String, String> m: map.entrySet())
        {
            if(m.getKey().equals(lastName)){
                countLastName++;
            }
        }
        return countLastName;
        //напишите тут ваш код

    }
}
