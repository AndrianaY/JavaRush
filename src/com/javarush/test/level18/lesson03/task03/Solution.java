package com.javarush.test.level18.lesson03.task03;

import com.javarush.test.level15.lesson12.home03.Tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream file = new FileInputStream(fileName);


        Map<Object, Integer> map = new HashMap<>();
        Object inputKey;
        int inputValue = 1;
        while (file.available() > 0)
        {
            inputKey = file.read();
            if (!(map.containsKey(inputKey)))
            {
                map.put(inputKey, 1);
            } else
            {
                inputValue = (map.get(inputKey) + 1);
                map.put(inputKey, inputValue);
            }
        }



        String keys = "";

        Integer maxValue  = Collections.max(map.values());


        Iterator iterator = map.entrySet().iterator();
        for (Map.Entry<Object, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue){
                if(iterator.hasNext()){
                    keys = keys +  entry.getKey() + " ";
                }
                else
                    keys = keys + entry.getKey();

            }
        }

        System.out.println(keys);
        file.close();
        br.close();
    }
}
