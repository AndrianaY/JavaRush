package Eckel.InnerClasses;

import javax.management.DescriptorAccess;

/**
 * Created by Andriana on 23.08.2016.
 */
//using "instance initialization" to perfor construction on anon inner class
public class Parcel10
{
    public Destination destination(final String dest, final float price){
        return new Destination()
        {
            private int cost;
//            inst init fir each obj
            {
            cost = Math.round(price);
            if(cost > 100)
                System.out.println("over budget");
            }
            private String label = dest;
            public String readLabel()
            {
                return label;
            }
        } ;  
    }

    public static void main(String[] args)
    {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
}
