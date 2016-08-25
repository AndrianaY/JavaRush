package otherStaff.Eckel.InnerClasses;


/**
 * Created by Andriana on 23.08.2016.
 */
abstract class Base{
    public int iBase;
    public Base(int i)
    {
        iBase = i;
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}
public class AnonymousConstructor
{
    public String insideInit, insideF;
    public static Base getBase(final int i){

        return new Base(i)
        {
            {
                iBase = i+1;
                System.out.println("inside instance initializer" + iBase);

            }

            public void f()
            {
                System.out.println("in anonymous f()");
            }
        };
    }

    public static void main(String[] args)
    {
        Base b = getBase(47);
        b.f();
        System.out.println(b.iBase);
    }
}
