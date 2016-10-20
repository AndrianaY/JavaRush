package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human granPa1 = new Human("garnpa1", true, 60);
        Human granPa2 = new Human("garnpa2", true, 60);
        Human granMa1 = new Human("garnma1", false, 60);
        Human granMa2 = new Human("garnma2", false, 60);
        Human pa = new Human("pa", true, 30);
        granPa1.children.add(pa);
        granMa1.children.add(pa);
        Human ma = new Human("ma", false, 30);
        granPa2.children.add(ma);
        granMa2.children.add(ma);
        Human child1 = new Human("child1", true, 5);
        Human child2 = new Human("child2", true, 5);
        Human child3 = new Human("child3", false, 5);
        pa.children.add(child1);
        pa.children.add(child2);
        pa.children.add(child3);
        ma.children.add(child1);
        ma.children.add(child2);
        ma.children.add(child3);


        System.out.println(granPa1);
        System.out.println(granMa1);
        System.out.println(granMa2);
        System.out.println(granPa2);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age){
            this.name =name;
            this.sex = sex;
            this. age = age;

        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
