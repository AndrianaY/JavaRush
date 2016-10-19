package com.javarush.level07.lesson12.home06;

import java.util.*;

/**
 * Created by Andriana_Yarmoliuk on 1/25/2016.
 */
public class Family
{

    public void execute(){
        List<Human> family = initFamily();
        printFamily(family);
    }

    private List<Human> initFamily(){
        List<Human> family = new ArrayList<Human>();
        Human grandFather1 = new Human("Petro", Gender.MALE, 57);
        Human grandFather2 = new Human("Pavlo", Gender.MALE, 60);
        Human grandMother1 = new Human("Odarka", Gender.FEMALE, 55);
        Human grandMother2 = new Human("Vasylyna", Gender.FEMALE, 55 );
        Human father = new Human("Ostap", Gender.MALE, 35, grandFather1, grandMother1);
        Human mother = new Human("Marysjka", Gender.FEMALE, 33, grandFather2, grandMother2);
        Human child1 = new Human("Oxana", Gender.FEMALE, 15, father, mother);
        Human child2 = new Human("Myhajlyna", Gender.FEMALE, 10, father, mother);
        Human child3 = new Human("Pylyp", Gender.FEMALE, 5, father, mother);

        family.addAll(Arrays.asList(grandFather1,grandFather2, grandMother1, grandMother2, father, mother, child1, child2, child3));

        Set<String> familySet = new HashSet<String>();
        boolean b = Collections.addAll(familySet, "арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель");

        return family;
    }

    private void printFamily(List<Human> family){
        for(Human member : family){
            System.out.println(member);
        }
    }
}
