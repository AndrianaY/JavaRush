package com.javarush.test.level14.lesson06.home01;

abstract class Hen{
    String country;
    abstract int getCountOfEggsPerMonth();
    String getDescription(){
        return "Я курица.";
    }
}