package com.javarush.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        HashMap<String, Double> map = new HashMap<>();
        InputStreamReader fileStream = new InputStreamReader(new FileInputStream(args[0]));
        BufferedReader br = new BufferedReader(fileStream);

        while(br.ready())
        {
        String line = br.readLine();
        String[] lines = line.trim().split(" ");

        if(map.containsKey(lines[0]))
        {
            Double val = map.get(lines[0]);
            val = val + Double.parseDouble(lines[1]);
            map.put(lines[0], val);
            System.out.println("************" + map.get(lines[0]));
        }
        else{
            map.put(lines[0], Double.parseDouble(lines[1]));
            System.out.println("************" + map.get(lines[0]));
        }


        }
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println();
        ArrayList<String> maxList = new ArrayList<>();
        Double maxValue = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            Double value = entry.getValue();

            if( value > maxValue){
                maxValue = value;
            }

        }

        System.out.println(maxValue);

        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            String key = entry.getKey();
            Double value = entry.getValue();
            if(value.equals(maxValue)){
                maxList.add(key);
            }
        }

        for (String s: maxList
             )
        {
            System.out.println(s);
        }

    }
}
