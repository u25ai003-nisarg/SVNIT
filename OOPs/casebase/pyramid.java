import java.util.Scanner;
import java.lang.Math;
public class pyramid {
	public static void main(String[] args) {
		int a;
		System.out.println("Please enter the no of lines");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int i = 0 ; i < a-1 ; i++)
		{
			for (int j = a ; j > i ; j--)
			{
				System.out.print("  ");
			}
			for (int k = 0 ; k <=i-1 ; k++)
			{
				System.out.print((int)Math.pow(2, k)+" ");
			}
			for (int k = i ; k >=0 ; k--)
			{
				System.out.print((int)Math.pow(2, k)+" ");
			}
			System.out.println();
		}
	}
}
