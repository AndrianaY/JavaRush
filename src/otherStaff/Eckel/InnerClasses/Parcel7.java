package otherStaff.Eckel.InnerClasses;

/**
 * Created by Andriana on 23.08.2016.
 */
//returning an instance of anonymus inner class
public class Parcel7
{
    public Eckel.InnerClasses.Contents contents(){
        return new Eckel.InnerClasses.Contents() {//insert a class definitiopn
            private int i = 11;
            public int value(){ return i; }
        };
    }
//    it is shorthand for:

    private class MyContents implements Eckel.InnerClasses.Contents
    {
        private int i = 15;
        public int value()
        {
            return i;
        }
    }

    public Eckel.InnerClasses.Contents contents1() { return  new MyContents(); }


    public static void main(String[] args)
    {
        Parcel7 p = new Parcel7();
        Eckel.InnerClasses.Contents c = p.contents();
        System.out.println(c.value());
        Eckel.InnerClasses.Contents c1 = p.contents1();
        System.out.println(c1.value());
    }
}
