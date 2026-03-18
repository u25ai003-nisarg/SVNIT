package OOPs.L1;
import java.util.Scanner;

public class OOP3
{
    public static void main(String []args)
    {
        System.out.println("please enter the number 1");
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        System.out.println("please enter the number 2");
        int n2 = scn.nextInt();
        System.out.println("please enter the number 3");
        int n3 = scn.nextInt();

        if(n1>n2&&n1>n3)
        {
            System.out.println("Larger number is "+n1);
        }
        else if(n2>n1&&n2>n3)
        {
            System.out.println("Larger number is "+n2);
        }
        else
        {
            System.out.println("Larger number is "+n3);
        }
        int sum = n1+n2+n3;
        int avg = sum/3;
        int prod = n1*n2*n3;
        System.out.println("The sum of number is " + sum);
        System.out.println("The product of number is " + prod);
        System.out.println("The average of number is " + avg);
    }
}
