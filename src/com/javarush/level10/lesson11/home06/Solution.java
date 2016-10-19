package com.javarush.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String surname;
        int age;
        Human friend;
        int height;
        String address;
        Human(String name, String surname, Human friend){
            this.name = name;
            this.surname = surname;
            this.friend.name = friend.name;
            this.friend.surname = friend.surname;

        }
        Human(String name, String surname, String address)
        {
            this.name = name;
            this.surname = surname;
            this.address = address;

        }
        Human(String name, String surname, int height, Human isHeiger)
        {
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.friend.name = isHeiger.name;
            this.friend.surname = isHeiger.surname;
        }
        Human(String surname, String address)
        {
            this.surname = surname;
            this.address = address;
        }
        Human(String name, String surname, int height, int age)
        {
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.age = age;
        }
        Human(String name, String surname, String friendName, String friendSurname )
        {
            this.name = name;
            this.surname = surname;
            this.friend.name = friendName;
            this.friend.surname = friendSurname;
        }
        Human(String name, String surname, int age, String friendName, String friendSurname, int friendAge )
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.friend.name = friendName;
            this.friend.surname = friendSurname;
            this.friend.age = friendAge;
        }
        Human(String name, String surname, int height, int age, Human friend)
        {
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.age = age;
            this.friend.name = friend.name;
            this.friend.surname = friend.surname;
            this.friend.age = friend.age;
        }
        Human(String address, Human friend)
        {
            this.friend = friend;
            this.friend.address = address;

        }
        Human(String surname, String name, String address, Human friend)
        {
            this.friend = friend;
            this.friend.name = name;
            this.friend.surname = surname;
            this.friend.address = address;
        }

    }
}
