package otherStaff.Eckel.InnerClasses;

/**
 * Created by Andriana on 24.08.2016.
 */
public class Exercise15_1
{
    public Exercise15 returning(final String returnedName){
        String newName = returnedName + "+anonymous";
        return new Exercise15(newName){
            {
                System.out.println("inside anonymous");
            }
        };
    }

    public static void main(String[] args)
    {
        Exercise15_1 ex = new Exercise15_1();
        Exercise15 ex15 = ex.returning("someName");
    }
}
