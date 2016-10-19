package com.javarush.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        SortOrder sortOrder = new SortOrder();
        sortOrder.readData();
        sortOrder.sort();
        sortOrder.printArr();
    }
}

class SortOrder  {

//        private int nNum1;
//        private int nNum2;
//        private int nNum3;
//        private int nNum4;
//        private int nNum5;

        public int[] randomNums = new int[5];

        public void readData() throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for(int i = 0; i < randomNums.length; i ++){
                String sNum = reader.readLine();
                randomNums[i] = Integer.parseInt(sNum);
            }



//            String sNum1 = reader.readLine();
//             nNum1 = Integer.parseInt(sNum1);
//
//            String sNum2 = reader.readLine();
//             nNum2 = Integer.parseInt(sNum2);
//
//            String sNum3 = reader.readLine();
//             nNum3 = Integer.parseInt(sNum3);
//
//            String sNum4 = reader.readLine();
//             nNum4 = Integer.parseInt(sNum4);
//
//            String sNum5 = reader.readLine();
//             nNum5 = Integer.parseInt(sNum5);
//              public int[] randomNums;
//            randomNums = new int[]{nNum1, nNum2, nNum3, nNum4, nNum5};    // статична ініціалізація
        }


        public void sort(){



            Sorter sorter = new BubbleSorter();

            sorter.sort(randomNums);
        }


    public void printArr()
    {
        for(int i = 0; i<randomNums.length; i++)
        {
            System.out.println(randomNums[i]);
        }
    }
}


