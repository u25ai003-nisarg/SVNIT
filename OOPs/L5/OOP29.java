
import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);

    void Average() {
        System.out.print("Enter the marks of First Subject : ");
        double a = sc.nextDouble();
        System.out.print("Enter the marks of Second Subject : ");
        double b = sc.nextDouble();
        System.out.print("Enter the marks of Third Subject : ");
        double c = sc.nextDouble();

        if((a+b+c)/3 >= 50) {
            System.out.println("Congratulations, You have passed th exam !");
            System.out.println("Your average marks is : " + (a+b+c)/3);
        }
        else {
            System.out.println("You have not qualified th exam !");
            System.out.println("Your average marks is : " + (a+b+c)/3);
        }
    }

    void input() {
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("\nWelcome " + name + "\n\n");
    }
}

public class OOP29 {
    static void main(String[] args) {

        Student s1 = new Student();

        s1.input();
        s1.Average();
    }
}