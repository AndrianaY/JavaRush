package otherStaff.Eckel.InnerClasses;

/**
 * Created by Andriana_Yarmoliuk on 8/22/2016.
 */
interface SomeInterface{
    SomeInterface someMethod();
}

public class Exercise9_10
{
    public boolean isScopeInner = true;
    SomeInterface methodInnerClass(){
        class SomeInterfaceImpl_1 implements SomeInterface{
            SomeInterfaceImpl_1(){
                System.out.println("method inner class");
            }
            public SomeInterface someMethod()
            {
                return null;
            }
        }
        return new SomeInterfaceImpl_1();
    }

    SomeInterface scopeInnerClass(boolean b){
        if(b)
        {
            class SomeInterfaceImpl implements SomeInterface
            {
                SomeInterfaceImpl(){
                    System.out.println("scope inner class");
                }

                public SomeInterfaceImpl someMethod()
                {
                    return null;
                }
            }
            return new SomeInterfaceImpl();
        }
        else
        {

            return null;
        }
    }

    public static void main(String[] args)
    {
        Exercise9_10 ex = new Exercise9_10();
        ex.methodInnerClass();
        ex.scopeInnerClass(true);
    }
}
