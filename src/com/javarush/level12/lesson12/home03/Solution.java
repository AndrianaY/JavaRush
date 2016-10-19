package com.javarush.level12.lesson12.home03;

/* Добавь один метод в класс Cat
Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet
    {
        protected String name;

        public Pet()
        {
        }

        public final String getName()
        {
            changeName();
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void changeName(){
            name = "";
        }

    }

    public static class Cat extends Pet
    {

    }
}