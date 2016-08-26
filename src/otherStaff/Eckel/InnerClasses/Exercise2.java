package otherstaff.eckel.innerclasses;



/**
 * Created by Andriana_Yarmoliuk on 8/19/2016.
 */
public class Exercise2
{
//    (1) Create a class that holds a String, and has a toString( ) method that
//    displays this String. Add several instances of your new class to a Sequence object, then
//        display them.
//    (1) Modify Exercise 1 so that Outer has a private String field (initialized
//                                                                            by the constructor), and Inner has a toString( ) that displays this field. Create an object of
//    type Inner and display it.

    private String str = "someString";

    Exercise2(){
        toString();
    }


    @Override
    public String toString(){
        return str;
    }

}
