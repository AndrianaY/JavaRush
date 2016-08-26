package otherStaff.MentorsExercises;

import com.javarush.test.level20.lesson02.task05.Solution;

/**
 * Created by Andriana_Yarmoliuk on 8/23/2016.
 */
public class HorseTest
{
    public static void main(String[] args)
    {
        class Horse{
            public String name;
            public Horse(String s){
                name = s;
            }
        }
        Object obj = new Horse("Zippo");
        Horse h = (Horse) obj;
        System.out.println(h.name);
    }
}
