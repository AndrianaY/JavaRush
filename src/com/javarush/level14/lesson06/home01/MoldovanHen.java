package com.javarush.level14.lesson06.home01;


public class MoldovanHen extends Hen{
    int getCountOfEggsPerMonth(){
        return 50;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

