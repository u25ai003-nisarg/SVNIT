package OOPs.L2;
import java.util.Scanner;

public class OOP12 {
    public static void main(String[] args) {
        System.out.println("Please enter account number");
        Scanner sc = new Scanner(System.in);
        int account = sc.nextInt();
        System.out.println("Please enter balance ");
        int balance = sc.nextInt();
        System.out.println("Please enter total of all items");
        int total = sc.nextInt();
        System.out.println("Please enter total credits");
        int credit = sc.nextInt();
        balance=balance+total-credit;
        if(balance>credit)
        {
            System.out.println("Credit limit exceeded");
        }
        else {
            System.out.println("Total balance : "+balance);
        }
    }
}
