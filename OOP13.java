package OOPs.L2;
import java.util.Scanner;

public class OOP13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the parking time in hours");
        int hours = sc.nextInt();
        if(hours<=2)
        {
            System.out.println("charge = 2 dollars");
        }
        else if (hours>18){
            System.out.println("charge = 10 dollars");
        }
        else
        {
            System.out.println("charge = "+(2+(hours/2))+"dollars");
        }
    }
}
