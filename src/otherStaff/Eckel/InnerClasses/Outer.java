package otherstaff.eckel.innerclasses;

/**
 * Created by Andriana_Yarmoliuk on 8/18/2016.
 */
public class Outer
{
    class Inner{

    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args)
    {
        Outer o = new Outer();
        Outer.Inner i = o.inner();
    }
}
