package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.*;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public static void main(String[] args) throws Exception
    {
        Solution sol = new Solution();
        sol.fillInPropertiesMap();
        sol.save(new FileOutputStream("d:\\prop.properties"));
    }

    public void fillInPropertiesMap() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);


        load(fileInputStream);
        System.out.println(properties);


        br.close();
        fileInputStream.close();

        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {

        Properties propert = new Properties(); //создаем properties
        for (Map.Entry<String, String> prop : properties.entrySet()) { //проходимся по mape
            propert.setProperty(prop.getKey(), prop.getValue());//сохраняем данные в наш new prop
        }
        propert.store(outputStream, null); //записываем данные


//implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();

        prop.load(inputStream);

        Enumeration<String> propEnum = (Enumeration<String>) prop.propertyNames();
        while(propEnum.hasMoreElements())
        {
            String key = propEnum.nextElement();
            String value = prop.getProperty(key);
            properties.put(key, value);
        }


        //implement this method - реализуйте этот метод
    }
}
