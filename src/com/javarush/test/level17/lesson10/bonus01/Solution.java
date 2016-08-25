package com.javarush.test.level17.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }


    public static void main(String[] args) throws IOException, ParseException
    {
        //start here - начни тут




            if(args[0].equals("-c"))
                {
                    Person person = null;
                    String name = "";
                    for (int i = 1; i < args.length - 2; i++)
                    {
                        name = name + " " + args[i];
                    }
                    name = name.trim();

                    if (args[args.length - 2].equals("м"))
                    {
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        Date date = format.parse(args[args.length - 1]);
                        person = Person.createFemale(name, date);
                    }
                    else if (args[args.length - 2].equals("ж"))
                    {
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        Date date = format.parse(args[3]);
                        person = Person.createFemale(name, date);
                    }
                    allPeople.add(person);
                    System.out.println(allPeople.size()-1);
                }

            else if(args[0].equals("-u"))
                {
                    int id = Integer.parseInt(args[1]);
                    String name = "";
                    for (int i = 2; i < args.length - 2; i++)
                    {
                        name = name + " " + args[i];
                    }
                    name = name.trim();
                    Person person = allPeople.get(id);
                    person.setName(name);
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = format.parse(args[4]);
                    person.setBirthDay(date);

                    if (args[args.length - 2].equals("м"))
                    {


                        person.setSex(Sex.MALE);


                    }
                    else if (args[args.length-2].equals("ж"))
                    {
                        person.setSex(Sex.FEMALE);
                    }
                    allPeople.set(id,person);
                 }
        else if(args[0].equals("-d")){
                int id =Integer.parseInt(args[1]);
                allPeople.get(id).setSex(null);
                allPeople.get(id).setBirthDay(null);
                allPeople.get(id).setName(null);
                }

        else if(args[0].equals("-i")){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String sex="";
                int id = Integer.parseInt(args[1]);
                if (allPeople.get(id).getSex().equals(Sex.MALE))
                {
                    sex = "м";
                }
                else if(allPeople.get(id).getSex().equals(Sex.FEMALE))
                {
                    sex = "ж";
                }
                System.out.println(allPeople.get(id).getName() + " " + sex + " " +
                        dateFormat.format(allPeople.get(id).getBirthDay()));
                }

            }

    }

