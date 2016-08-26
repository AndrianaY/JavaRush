package otherstaff.eckel.innerclasses.Exercise7_8;

/**
 * Created by Andriana_Yarmoliuk on 8/22/2016.
 */
public class SuperClass
{
    private String ownerName = "Andriana";
    private void ownerActions(){

    }

    class InnerClass{
        SuperClass sp = SuperClass.this;
        private String privateName = "secretKey";
        public void modifyOwnerName(){
            sp.ownerName = "Andriano4ka";
            sp.ownerActions();
        }

    }
    String secondMethod(){
        InnerClass ic = new InnerClass();
        ic.modifyOwnerName();
        ic.privateName = ic.privateName + "granted";
        return ic.privateName;
    }

    public static void main(String[] args)
    {
        SuperClass spp = new SuperClass();
        System.out.println(spp.ownerName);
        System.out.println(spp.secondMethod());
        System.out.println(spp.ownerName);

    }
}
