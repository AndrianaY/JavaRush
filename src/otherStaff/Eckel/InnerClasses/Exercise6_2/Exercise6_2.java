package otherStaff.Eckel.InnerClasses.Exercise6_2;

import otherStaff.Eckel.InnerClasses.Exercise6.Exercise6;
import otherStaff.Eckel.InnerClasses.Exercise6_1.Exercise6_1;

/**
 * Created by Andriana_Yarmoliuk on 8/22/2016.
 */
public class Exercise6_2 extends Exercise6_1
{
    Exercise6 returningInnerProtected(){
        Exercise6_1 ex = new Exercise6_1();
        InnerProtected ip = ex.innerProtected();
        return (Exercise6) ip;

    }
}
