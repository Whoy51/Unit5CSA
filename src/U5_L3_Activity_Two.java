/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;
import shapes.Rectangle;
import testing.Math;

public class U5_L3_Activity_Two
{
    public static void randomize(Rectangle rect){
        rect.setLength((int) (java.lang.Math.random() * 6) *2 + 10);
        rect.setWidth((int) (java.lang.Math.random() * 4) *2 + 7);

    }
}
