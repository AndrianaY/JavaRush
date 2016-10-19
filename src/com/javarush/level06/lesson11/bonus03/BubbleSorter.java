package com.javarush.level06.lesson11.bonus03;

/**
 * Created by Andriana_Yarmoliuk on 1/19/2016.
 */

class BubbleSorter implements Sorter{

    @Override
    public void sort(int[] arrayToSort){

        for(int i = 0; i < arrayToSort.length-1; i++)
        {
            for (int j = 0; j < arrayToSort.length-1; j++)
            {
                if (arrayToSort[j] > arrayToSort[j+1])
                {
                    swap(arrayToSort ,j, j+1);
                }
            }
        }
    }

    private void swap(int[] arrayToSort, int i, int j){
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = temp;
    }
}