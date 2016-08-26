package otherstaff.eckel.innerclasses;



/**
 * Created by Andriana_Yarmoliuk on 8/19/2016.
 */
public class Foo
{

    Foo()
    {
        System.out.print("foo");
    }

    class Bar
    {
        Bar()
        {
            System.out.print("bar");
        }
        public void go()
        {
            System.out.print("hi");
        }
    }

    public static void main(String[] args)
    {
        Foo f = new Foo();
        f.makeBar();
    }
    void makeBar()
    {
        (new Bar() {}).go();
    }

}
