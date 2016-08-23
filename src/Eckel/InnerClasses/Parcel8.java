package Eckel.InnerClasses;

/**
 * Created by Andriana on 23.08.2016.
 */
//ca;;ing the base-classconstructotr
public class Parcel8
{
    public Wrapping wrapping (int x){
//        base constructor call
        return new Wrapping(x){//pass construcrtor argument

            public int value(){
                return super.value() * 47;
            }
        };

    }

    public static void main(String[] args)
    {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        System.out.println(w.i);
        System.out.println(w.value());
    }
}
