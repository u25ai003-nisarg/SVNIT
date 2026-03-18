package OOPs.L1;
import java.util.Scanner;

public class OOP4 {
    public static void main() {
        int radius;
        System.out.println("Please enter the radius ");
        Scanner scn = new Scanner(System.in);
        radius = scn.nextInt();
        float circum = ((float)2)*((float)(Math.PI))*(float)radius;
        float area = (float)Math.PI*(float)radius*(float)radius;
        System.out.println("The diameter of the circle is "+radius*2);
        System.out.println("The circumference of the circle is "+circum);
        System.out.println("The area of the circle is "+area);
    }
}
