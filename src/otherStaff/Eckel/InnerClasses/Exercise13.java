package otherStaff.Eckel.InnerClasses;

import Eckel.InnerClasses.*;

/**
 * Created by Andriana on 24.08.2016.
 */
public class Exercise13
{
    public Eckel.InnerClasses.Destination dest(final String dest){
        return new Eckel.InnerClasses.Destination(){
            private String label = dest;
            public String readLabel()
            {
                return label;
            }
        };
    }
}
