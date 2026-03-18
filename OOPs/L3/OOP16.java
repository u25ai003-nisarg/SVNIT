import java.util.Scanner;

class x 
{
	int i;
	int j;
	x(int a,int b)
	{
		i = a;
		j = b;
	}
	int sum()
	{
		return (i+j);
	}
}
class y extends x
{
	y(int a,int b)
	{
		super(a,b);
		
	}
	int product()
	{
		return i*j;
	}
}
class z extends y
{
	z(int a,int b)
	{
		super(a,b);
	}
	int diffrence()
	{
		return i-j;
	}
}

public class OOP16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		x x = new x(a,b);
		y y = new y(a,b);
		z z = new z(a,b);
		System.out.println(x.sum());
		System.out.println(y.product());
		System.out.println(z.diffrence());
		
	}

}
