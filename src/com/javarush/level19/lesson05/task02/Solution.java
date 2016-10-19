package com.javarush.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String[] str;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(br.readLine());
        BufferedReader filereader = new BufferedReader(fr);

        while(fr.ready()){
            String temp = filereader.readLine();
            str = temp.split("\\p{Punct}");
            for(String p: str){
                if(p.equals("world"))
                {
                    count++;
                }
            }

            temp = filereader.readLine();
        }

        System.out.println(count);
        br.close();
        fr.close();
        filereader.close();
    }
}
