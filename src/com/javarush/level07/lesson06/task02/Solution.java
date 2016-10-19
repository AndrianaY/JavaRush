package com.javarush.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {

        List <String> list = new ArrayList<String>();
        int maxLen = 0;
        String st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i < 5; i++){
            st = br.readLine();
            list.add(st);
            if (st.length() > maxLen){
                maxLen = st.length();
            }
        }

        for (String s: list )
        {
            if(s.length()==maxLen){
                System.out.println(s);
            }
        }


        //напишите тут ваш код

    }
}
