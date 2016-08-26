package com.javarush.test.level22.lesson05.task01;

import java.util.ArrayList;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution
{
    public static String getPartOfString(String string) throws TooShortStringException
    {
        String str = "";
        String[] list;


            if (string == null || string.isEmpty() || string.equals("")|| (list = string.split(" ")).length < 5)
            {
                throw new TooShortStringException();
            }

            else
            {
                str =  list[1] + " " + list[2] + " " + list[3] + " " + list[4];
            }


   return str;

    }

    public static class TooShortStringException extends Exception
    {

    }

    public static void main(String[] args)
    {

        try
        {
            System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        }
        catch (TooShortStringException e)
        {
            e.printStackTrace();
        }
    }
}

