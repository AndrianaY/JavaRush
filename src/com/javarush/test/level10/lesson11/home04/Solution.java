package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] charArray = s.toCharArray();
        List<char[]> asList = Arrays.asList(charArray);
        List<Character> listC = new ArrayList<Character>();
        for (char c : charArray) {
            listC.add(c);
        }

        for(int i = 0; i < 40; i++)
        {
            for (Character c : listC)
                System.out.print(c);
            listC.remove(0);
            System.out.println();


        }
    }

}
