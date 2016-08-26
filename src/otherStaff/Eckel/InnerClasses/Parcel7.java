package otherstaff.eckel.innerclasses;

/**
 * Created by Andriana on 23.08.2016.
 */
//returning an instance of anonymus inner class
public class Parcel7
{
    public Contents contents(){
        return new Contents() {//insert a class definitiopn
            private int i = 11;
            public int value(){ return i; }
        };
    }
//    it is shorthand for:

    private class MyContents implements Contents
    {
        private int i = 15;
        public int value()
        {
            return i;
        }
    }

    public Contents contents1() { return  new MyContents(); }


    public static void main(String[] args)
    {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());
        Contents c1 = p.contents1();
        System.out.println(c1.value());
    }
}
