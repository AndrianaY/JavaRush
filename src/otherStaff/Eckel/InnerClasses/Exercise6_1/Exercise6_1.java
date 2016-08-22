package otherStaff.Eckel.InnerClasses.Exercise6_1;

import otherStaff.Eckel.InnerClasses.Exercise6.Exercise6;

/**
 * Created by Andriana_Yarmoliuk on 8/22/2016.
 */
public class Exercise6_1
{
    protected class InnerProtected implements Exercise6{
        public String someMethod()
        {
            return "Exercise6_1 innerProtected class someMethod";
        }
    }

    public InnerProtected innerProtected(){
        return new InnerProtected();
    }
}
