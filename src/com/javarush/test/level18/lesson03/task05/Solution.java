package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(br.readLine());
        int data;
        TreeSet<Integer> treeSet = new TreeSet<>();
        while(file.available() > 0){
            data = file.read();
            if(!(treeSet.contains(data))){
                treeSet.add(data);
            }

        }
        br.close();
        file.close();
        Iterator iterator;
        iterator = treeSet.iterator();
        for(Integer ts : treeSet){
            if(iterator.hasNext()){
                System.out.print(ts + " ");
            }
            else
            {
                System.out.print(ts);
            }
        }
    }
}
