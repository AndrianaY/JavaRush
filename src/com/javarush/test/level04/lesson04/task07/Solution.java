package com.javarush.test.level04.lesson04.task07;

/* Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sYear = bufferedReader.readLine();
        int nYear = Integer.parseInt(sYear);
        int quat = nYear % 4;
        int hund = nYear % 100;
        int hundQuat = nYear % 400;
        int finalYear;

        if(quat == 0)
        {
            if(hund == 0)
            {
                if(hundQuat == 0)
                    finalYear = 366;
                else
                    finalYear = 365;
            }
            else
                finalYear = 366;
        }
        else
        {
            finalYear = 365;
        }




        System.out.println("количество дней в году: " +  finalYear);

    }
}