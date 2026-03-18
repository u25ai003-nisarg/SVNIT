
import java.util.Scanner;

public class OOP5
{
    public static void main(String []args)
    {
        System.out.println("please enter the number");
        Scanner scn1 = new Scanner(System.in);
        int n1 = scn1.nextInt();
        for(int i = 5;i>=1;i--)
        {
            int q=1;
            for(int j = 1;j<=i;j++)
            {
                q=q*10;
            }
            System.out.print(n1/(q/10));
            System.out.print("   ");
            n1=n1%(q/10);
        }
    }
}
