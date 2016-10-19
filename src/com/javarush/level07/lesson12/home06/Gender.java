package com.javarush.level07.lesson12.home06;

/**
 * Created by Andriana_Yarmoliuk on 1/25/2016.
 */
    public enum Gender {

        MALE("мужской"),
        FEMALE("женский");

        private String strValue;

        Gender(String value){
            this.strValue = value;
        }

        public String toString(){
            return strValue;
        }
    }

