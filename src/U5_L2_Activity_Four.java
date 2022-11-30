/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four
{

    public static void coinConverter(int pennies){
       System.out.println("Dollar Bills: " + pennies/100);
       pennies %= 100;
       System.out.println("Quarters: " + pennies/25);
       pennies %= 25;
       System.out.println("Dimes: " + pennies/10);
       pennies %= 10;
       System.out.println("Nickels: " + pennies/5);
       pennies %= 5;
       System.out.println("Pennies: " + pennies);
    }
}