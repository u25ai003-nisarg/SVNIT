package OOPs.L1;
import java.util.Scanner;

public class OOP1
{
    public static void main(String []args)
    {
        System.out.println("please enter the number 1");
        Scanner scn1 = new Scanner(System.in);
        int n1 = scn1.nextInt();
        System.out.println("please enter the number 2");
        Scanner scn2 = new Scanner(System.in);
        int n2 = scn2.nextInt();
        int sum,sub,div,quot;
        sum = n1+n2;
        sub = n1-n2;
        div = n1/n2;
        quot = n1%n2;
        System.out.println("Sum :"+sum);
        System.out.println("Diffrence :"+sub);
        System.out.println("Division :"+div);
        System.out.println("Quotient :"+quot);
    }
}
