package com.javarush.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileRead = new FileReader(br.readLine());
        FileWriter fileWrite = new FileWriter(br.readLine());
        BufferedReader fR = new BufferedReader(fileRead);
        BufferedWriter fW = new BufferedWriter(fileWrite);

        while(fR.ready()){
            fW.write(fR.readLine().replaceAll(".", "!"));
        }
        br.close();
        fileRead.close();
        fileWrite.close();
        fR.close();
        fW.close();
    }
}
