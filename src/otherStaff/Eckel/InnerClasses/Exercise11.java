package otherstaff.eckel.innerclasses;

/**
 * Created by Andriana_Yarmoliuk on 8/22/2016.
 */
public class Exercise11
{
    private void f(){}

    private static class PrivateInnerClass implements Destination
    {

        @Override
        public String readLabel()
        {
            return null;
        }
    }

    public Destination privateClassReference(){
        return new PrivateInnerClass();
    }

    public static void main(String[] args)
    {
        Exercise11 ex = new Exercise11();
        Destination exd = ex.privateClassReference();


    }
}

