/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;
public class U5_L4_Activity_Four {

    public static int substringCount(String s1, String s2){
        int times = 0;
        // For some reason w/o try catch there's an error.
        // If you haven't learned this yet don't worry, it's going to be learned later in ProjectSTEM.
        try {
            for (int i = 0; i < s1.length(); i++){
                if (s1.substring(i, i + s2.length()).equals(s2)){
                    times++;
                }
            }
        }catch (Exception e){e.printStackTrace();}
        return times;
    }
}
