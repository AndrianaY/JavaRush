package com.javarush.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int key;
        int value;
        while (file.available() > 0)
        {
            key = file.read();
            if (!(map.containsValue(key)))
            {
                map.put(key, 1);
            } else
            {
                value = (map.get(key) + 1);
                map.put(key, value);
            }
        }

        Integer min = Collections.min(map.values());

            Iterator iterator = map.entrySet().iterator();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() == min){
                    if(iterator.hasNext()){
                        System.out.print(entry.getKey() + " ");
                    }
                    else
                        System.out.print(entry.getKey());

                }
            }
        br.close();
        file.close();

    }
}
