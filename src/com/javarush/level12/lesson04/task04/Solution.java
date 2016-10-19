package com.javarush.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int min(int iN, int iM){
if(iN > iM)
    return iM;
        else
    return iN;
    }

    public static long min(long lN, long lM){
        if(lN > lM)
            return lM;
        else
            return lN;
       }
    public static double min(double dN, double dM){
        if(dN > dM)
            return dM;
        else
            return dN;

    }
}
