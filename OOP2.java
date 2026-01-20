package OOPs.L1;
import java.util.Scanner;

public class OOP2
{
    public static void main(String []args)
    {
        System.out.println("please enter the number 1");
        Scanner scn1 = new Scanner(System.in);
        int n1 = scn1.nextInt();
        System.out.println("please enter the number 2");
        Scanner scn2 = new Scanner(System.in);
        int n2 = scn2.nextInt();
        if(n1>n2)
        {
            System.out.println("Larger number is "+n1);
        }
        else if(n2>n1)
        {
            System.out.println("Larger number is "+n2);
        }
        else
        {
            System.out.println("Both number are equal");
        }
    }
}
