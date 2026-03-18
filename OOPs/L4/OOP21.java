
import java.util.Scanner;

public class OOP21 {
	public static void main(String[] args) {
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String s = sc.next();
		for(int i = 0 ; i<s.length();i++)
		{
			for (int j = i+1;j<s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println("Error in the string ");
					flag = 1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No Error");
		}
	}
}
