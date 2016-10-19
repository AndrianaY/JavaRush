package com.javarush.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("dsfgds", 45, "rsghrt");
        Man man2 = new Man("retgrwfgds", 56, "jkujit");
        Woman wom1 = new Woman("dgdsfg", 34, "rtfhtd");
        Woman wom2 = new Woman("dfghghjn", 24, "ghjyhukyhujkm");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(wom1.name + " " + wom1.age + " " + wom1.address);
        System.out.println(wom2.name + " " + wom2.age + " " + wom2.address);

    }

    public static  class Man
    {
        private String name;
        private int age;
        private String address;
        Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        private String name;
        private int age;
        private String address;

        Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
