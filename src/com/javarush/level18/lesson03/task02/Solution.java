package com.javarush.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(br.readLine());

        List<Integer> list = new ArrayList<>();

        while (file.available() > 0){
            list.add(file.read());
        }

        Integer min = Collections.min(list);
        System.out.println(min);
    }

}
