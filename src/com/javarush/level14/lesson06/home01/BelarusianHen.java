package com.javarush.level14.lesson06.home01;


public class BelarusianHen extends Hen{
    int getCountOfEggsPerMonth(){
        return 20;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}