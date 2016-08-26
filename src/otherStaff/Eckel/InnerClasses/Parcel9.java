package otherstaff.eckel.innerclasses;

/**
 * Created by Andriana on 23.08.2016.
 */
public class Parcel9
{
//    arg must be final to use inside anonym inner class
    public Destination destination(final String dest){
        return new Destination()
        {
            private String label = dest;
            public String readLabel()
            {
                return label;
            }
        };
    }

    public static void main(String[] args)
    {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }
}
