package otherStaff.Eckel.InnerClasses;

/**
 * Created by Andriana_Yarmoliuk on 8/19/2016.
 */
// Qualifying access to the outer-class object.
public class DotThis
{
    void f(){
        System.out.println(this.getClass());
    }

    public class Inner{
        public DotThis outer(){
            return DotThis.this; // A plain "this" would be Inner’s "this"
        }
    }

    public Inner inner() { return new Inner();}

    public static void main(String[] args)
    {
        DotThis dt = new DotThis();
        dt.f();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
