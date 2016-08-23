package Eckel.InnerClasses;

/**
 * Created by Andriana on 23.08.2016.
 */
public class Exercise12
{
    private int field = 0;
    public int getField(){
        return field;
    }
    private void method(){
        System.out.println("inside inner instance - metyhod" + field);
    }
    public Contents contents(final int i){
        return new Contents()
        {
            @Override
            public int value()
            {
                field = field + i;
                method();
                return field + 5;
            }
        };
    }

    public static void main(String[] args)
    {
        Exercise12 ex = new Exercise12();
        System.out.println(ex.getField());
        Contents c = ex.contents(15);
        System.out.println(c.value());
    }
}
