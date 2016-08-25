package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    private static Map<String,String> countries = new HashMap<String,String>();


    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        static {
            countries.put("Ukraine", "UA");
            countries.put("Russia", "RU");
            countries.put("Canada", "CA");
        }

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }


        @Override
        public String getCountryCode()
        {
            return countries.get(customer.getCountryName());
        }

        @Override
        public String getCompany()
        {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName()
        {
            String fName = (contact.getName().split(", "))[1];
            return fName;
        }

        @Override
        public String getContactLastName()
        {
            String lName = (contact.getName().split(", "))[0];
            return lName;
        }

        @Override
        public String getDialString()
        {
            String str = contact.getPhoneNumber();
            str = str.replaceAll("[() -]", "");
            return "callto://" + str;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}