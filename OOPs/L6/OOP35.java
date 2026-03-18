
import java.util.Scanner;

class Bank {

    Scanner sc = new Scanner(System.in);
    double amount;
    public static double balance = 0;

    void withdraw() {
        System.out.print("Enter the amount you want to withdraw from your account : ");
        amount = sc.nextInt();
        if(balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient Balance !");
        }
    }

    void deposit() {
        System.out.print("Enter the amount you want to deposit to your account : ");
        amount = sc.nextInt();
        balance += amount;
    }

    void showBalance() {
        System.out.println("Your bank balance is : " + balance);
    }
}

public class OOP35 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        while(true) {
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            if(choice == 1) {
                bank.deposit();
            }
            else if(choice == 2) {
                bank.withdraw();
            }
            else if(choice == 3) {
                bank.showBalance();
            }
            else {
                System.out.println("Thanks for using Bank Facility -> VISIT AGAIN !");
                break;
            }
        }
    }
}