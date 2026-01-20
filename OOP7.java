package OOPs.L2;

import java.util.Scanner;

public class OOP7 {
    public static void main() {
        System.out.println("please enter the total miles driven per day");
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        System.out.println("please enter the cost per gallon of gasoline\n");
        int n2 = scn.nextInt();
        System.out.println("please enter the average fees per day");
        int n3 = scn.nextInt();
        System.out.println("please enter the tolls per day");
        int n4 = scn.nextInt();
        int cost = (n1*n2)+n3+n4;
        System.out.println("cost : "+cost);
    }
}
