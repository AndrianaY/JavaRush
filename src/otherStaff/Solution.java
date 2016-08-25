package otherStaff;

/**
 * Created by Andriana_Yarmoliuk on 2/9/2016.
 */
public class Solution
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        String convList = obj.convert("qwertyuio", 3);

            System.out.print(convList);

    }

    public String convert(String s, int numRows)
    {


        if(numRows==1)
            return s;
        StringBuilder builder = new StringBuilder();
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j = j + step) {
                    builder.append(s.charAt(j));
                }
            } else {
                int j = i;
                boolean flag = true;
                int step1 = 2 * (numRows - 1 - i);
                int step2 = step - step1;
                while (j < s.length()) {
                    builder.append(s.charAt(j));
                    if (flag)
                        j = j + step1;
                    else
                        j = j + step2;
                    flag = !flag;
                }
            }
        }
        return builder.toString();

    }
}


