package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen{
    int getCountOfEggsPerMonth(){
        return 10;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}