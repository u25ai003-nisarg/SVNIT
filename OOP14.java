
import java.util.Scanner;

class figure
{
	double r;
	double a;
	double v;
	public void dispArea(double a)
	{
		System.out.println("The area is "+a);
	}
	public void dispVolume(double v)
	{
		System.out.println("The volume is "+v);
	}
}
class cone extends figure
{
	double h;
	double s;//slant height
	public void calcArea(double r)
	{
		a=Math.PI*(r*r + r*s); 
	}
	public void calcVolume(double r)
	{
		v=Math.PI*r*r*h/3;
	}
	
}

public class OOP14 {
	public static void main(String[] args)
	{
		
		figure f = new figure();
		cone c = new cone();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of cone");
		f.r = sc.nextDouble();
		System.out.println("Please enter the height of cone");
		c.h = sc.nextDouble();
		System.out.println("Please enter the slant height of cone");;
		c.s = sc.nextDouble();
		c.r=f.r;
		c.calcArea(c.r);
		c.calcVolume(c.r);
		c.dispArea(c.a);
		c.dispVolume(c.v); 
	}
}
