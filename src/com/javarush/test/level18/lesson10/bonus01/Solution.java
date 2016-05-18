package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static FileInputStream fileInput;
    public static FileOutputStream fileOutput;
    public static ArrayList<Integer> data = new ArrayList<>();


    public static void main(String[] args) throws IOException
    {

            if(args[0].equals("-e")){
                writeFile(coding(readFile(args[1])), args[2]);
            }
            else if(args[0].equals("-d")){
                writeFile(deCoding(readFile(args[1])), args[2]);
            }
            else {
                System.out.println("not correct first parameter");
            }

    }

    public static ArrayList<Integer> readFile(String inputFileName) throws IOException
    {
        fileInput = new FileInputStream(inputFileName);
        while (fileInput.available() > 0){
            data.add(fileInput.read());
        }
        return data;
    }

    public static void writeFile(ArrayList<Integer> arrayToSave, String fileOutputName) throws IOException
    {
        fileOutput = new FileOutputStream(fileOutputName);
        for (Integer a : arrayToSave)
        {
            fileOutput.write((char)a.byteValue());
        }

    }


    public static ArrayList<Integer> coding(ArrayList<Integer> dataToCode){
        Integer l;
        for (int i = 0; i < dataToCode.size(); i++)
        {
            l = dataToCode.get(i);
            if(l >= 65 && l <= 75){
                l = l+60;
                dataToCode.set(i,l);
            }
            else if(l > 75 && l <= 90){
                l = l-40;
                dataToCode.set(i,l);
            }
            else if(l >= 97 && l <= 110){
                l = l - 55;
                dataToCode.set(i,l);
            }
            else if (l > 110 && l <=122){
                l = l + 30;
                dataToCode.set(i,l);
            }
        }


        return dataToCode;
    }

    public static ArrayList<Integer> deCoding(ArrayList<Integer> dataToDecode){
        Integer l;
        for (int i = 0; i < dataToDecode.size(); i++)
        {
            l = dataToDecode.get(i);
            if(l >= 125 && l <= 135){
                l = l - 60;
                dataToDecode.set(i,l);
            }
            else if(l > 35 && l <= 50){
                l = l + 40;
                dataToDecode.set(i,l);
            }
            else if(l >= 42 && l <= 72){
                l = l + 55;
                dataToDecode.set(i,l);
            }
            else if (l > 140 && l <=152){
                l = l + 30;
                dataToDecode.set(i,l);
            }
        }

        return dataToDecode;
    }

}
