package OOPs.L2;
import java.util.Scanner;

public class OOP11 {
    public static void main(String[] args) {
        System.out.println("Please enter the miles driven");
        Scanner sc = new Scanner(System.in);
        int miles = sc.nextInt();
        System.out.println("Please enter the gallons of fuel used");
        int fuel = sc.nextInt();
        System.out.println("The miles per gallon is "+(miles/fuel));
    }
}
