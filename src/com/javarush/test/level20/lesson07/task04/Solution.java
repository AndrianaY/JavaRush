package com.javarush.test.level20.lesson07.task04;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Serializable Solution
Сериализуйте класс Solution.
Подумайте, какие поля не нужно сериализовать, пометить ненужные поля — transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.
Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream)
2) создать экземпляр класса Solution - savedObject
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть)
4) создать другой экземпляр класса Solution с другим параметром
5) загрузить из потока на чтение объект - loadedObject
6) проверить, что savedObject.string равна loadedObject.string
7) обработать исключения
*/
public class Solution implements Serializable{
    public static void main(String[] args)
    {
        FileOutputStream fileO = null;
        try
        {
            fileO = new FileOutputStream("d:\\qwe1.dat");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        ObjectOutputStream outputStream = null;
        try
        {
            outputStream = new ObjectOutputStream(fileO);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Solution savedObject = new Solution(10);
        try
        {
            outputStream.writeObject(savedObject);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        FileInputStream fileI = null;
        try
        {
            fileI = new FileInputStream("d:\\qwe1.dat");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(fileI);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        Solution savedObject1 = new Solution(20);

        Solution loadedObject = null;
        try
        {
            loadedObject = (Solution) inputStream.readObject();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        System.out.println(savedObject.string.equals(loadedObject.string));

        System.out.println(new Solution(4));

        try
        {
            fileI.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            inputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fileO.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            outputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
