package otherStaff.Eckel.InnerClasses;

/**
 * Created by Andriana on 23.08.2016.
 */
public class Parcel9
{
//    arg must be final to use inside anonym inner class
    public Eckel.InnerClasses.Destination destination(final String dest){
        return new Eckel.InnerClasses.Destination()
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
        Eckel.InnerClasses.Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }
}