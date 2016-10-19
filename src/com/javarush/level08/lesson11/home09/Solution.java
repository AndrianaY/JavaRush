package com.javarush.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        DateFormat format = new SimpleDateFormat("MMMM dd yyyy");
        Date date = format.parse(s);

        SimpleDateFormat newFormat= new SimpleDateFormat("D");
        String sOutput = newFormat.format(date);

        SimpleDateFormat newFormatPrint= new SimpleDateFormat("MMMM d yyyy");
        String sPrint = newFormatPrint.format(date);
        System.out.println(/*sPrint.toUpperCase() + " = " + */isDateOdd(sOutput));


    }

    public static boolean isDateOdd(String date)
    {

        Integer nDate = Integer.parseInt(date);

        if((nDate%2)==0)
            return false;
        else
            return true;
    }
}
