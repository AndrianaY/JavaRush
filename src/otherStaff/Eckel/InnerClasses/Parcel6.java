package otherstaff.eckel.innerclasses;


/**
 * Created by Andriana_Yarmoliuk on 8/22/2016.
 */
//Nesting a class within a scope
public class Parcel6
{
    private String interanlTracking(boolean b){
        if (b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){ return  id; }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
            return s;
        }
        return "it's false";
//        can't use it here. out of scope:
//!       TrackingSlip ts = new TrackingSlip("x"):
    }
    public String track(boolean tB){ return interanlTracking(tB); }

    public static void main(String[] args)
    {
        Parcel6 p = new Parcel6();
        System.out.println(p.track(false));
    }
}
