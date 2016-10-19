package com.javarush.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
int l = 0;
        print(l);
    }

    public static void print (int i){

        print((Integer)i);
    }
    public static void print(Integer k){
        System.out.print(k);
    }
}
