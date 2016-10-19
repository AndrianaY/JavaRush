package com.javarush.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable, Defensable
{
    private static int hitCount;
    public BodyPart chooseBodyPart(int hits){
        BodyPart chosenBodyPart = null;
        if (hits == 1)
        {
            chosenBodyPart =  BodyPart.ARM;
        } else if (hits == 2)
        {
            chosenBodyPart =  BodyPart.HEAD;
        } else if (hits == 3)
        {
            this.hitCount = 0;
            chosenBodyPart =  BodyPart.LEG;
        }else if (hits == 4)
        {
            this.hitCount = 0;
            chosenBodyPart =  BodyPart.BRE;
        }

        return chosenBodyPart;
    }
    public BodyPart attack()
    {

        hitCount = hitCount + 1;
        return chooseBodyPart(hitCount);

    }

    public BodyPart defense()
    {
//        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 1;

//        if (hitCount == 1)
//        {
//            defencedBodyPart =  BodyPart.HEAD;
//        } else if (hitCount == 2)
//        {
//            defencedBodyPart =  BodyPart.LEG;
//        } else if (hitCount == 3)
//        {
//            hitCount = 0;
//            defencedBodyPart =  BodyPart.ARM;
//        }
//        else if (hitCount == 4)
//        {
//            hitCount = 0;
//            defencedBodyPart =  BodyPart.BRE;
//        }
//        return defencedBodyPart;

        hitCount = hitCount + 1;
        return chooseBodyPart(hitCount);
    }

}
