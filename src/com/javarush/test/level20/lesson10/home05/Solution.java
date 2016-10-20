package com.javarush.test.level20.lesson10.home05;

import java.io.*;
import java.util.logging.Logger;



/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Person p = new Person("aaa", "bbb", "ccc", Sex.FEMALE);

        FileOutputStream fileOutput = new FileOutputStream("person.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(p);
        fileOutput.close();
        outputStream.close();

        //load cat from file
        FileInputStream fiStream = new FileInputStream("person.dat");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Person object = (Person) objectStream.readObject();
        fiStream.close();
        objectStream.close();

        System.out.println(object.firstName + " " + object.sex);

    }


    public static class Person implements Serializable{
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        public Person(){
            this.greetingString = "Hello, ";
        }
        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex implements Serializable{
        MALE,
        FEMALE
    }
}
