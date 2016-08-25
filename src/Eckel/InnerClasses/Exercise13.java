package Eckel.InnerClasses;

/**
 * Created by Andriana on 24.08.2016.
 */
public class Exercise13
{
    public Destination dest(final String dest){
        return new Destination(){
            private String label = dest;
            public String readLabel()
            {
                return label;
            }
        };
    }
}
