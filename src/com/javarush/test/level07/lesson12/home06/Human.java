package com.javarush.test.level07.lesson12.home06;

/**
 * Created by Andriana_Yarmoliuk on 1/25/2016.
 */
public class Human
{
        String name;
        Gender sex;
        int age;
        Human father;
        Human mother;

        Human (String name, Gender sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        Human (String name, Gender sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + this.sex;
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

