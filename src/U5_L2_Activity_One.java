/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U5_L2_Activity_One
{
    public static void timeOfDay(int hour){
        String time = "";
        if (hour == 0){
            time = "midnight";
        }else if (hour == 12){
            time = "noon";
        }else if (hour == 18){
            time = "dusk";
        }else if (hour > 0 && hour < 12){
            time = "morning";
        }else if (hour > 12 && hour < 18){
            time = "afternoon";
        }else if (hour > 18 && hour < 24){
            time = "evening";
        }
        System.out.println(time);
    }
}