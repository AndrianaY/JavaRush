package com.javarush.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner){

            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {

            String str = scanner.nextLine();
            String[] words = str.split(" ");
            int year = Integer.parseInt(words[5]);
            int month = Integer.parseInt(words[4]) - 1;
            int day = Integer.parseInt(words[3]);
            Calendar bd = new GregorianCalendar(year, month, day);


            return new Person(words[1], words[2], words[0], bd.getTime());
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }
    }
}
