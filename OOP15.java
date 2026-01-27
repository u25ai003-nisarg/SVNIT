
import java.util.Scanner;

class figure1
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
class cone1 extends figure1
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
class sphere1 extends figure1
{
	public void calcArea(double r)
	{
		a=4*Math.PI*(r*r); 
	}
	public void calcVolume(double r)
	{
		v=4*Math.PI*r*r*r/3;
	}
}
class cylinder1 extends figure1
{
	double h;
	public void calcArea(double r)
	{
		a=Math.PI*(r*r + r*h); 
	}
	public void calcVolume(double r)
	{
		v=Math.PI*r*r*h;
	}
}
public class OOP15 {
	public static void main(String[] args)
	{
		
		figure1 f = new figure1();
		cone1 c = new cone1();
	    sphere1 s = new sphere1();
	    cylinder1 cy = new cylinder1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius");
		f.r = sc.nextDouble();
		System.out.println("Please enter the height of cone1");
		c.h = sc.nextDouble();
		System.out.println("Please enter the slant height of cone1");;
		c.s = sc.nextDouble();
		System.out.println("Please enter the height of cylinder1");
		cy.h = sc.nextDouble();
		c.r=f.r;
		s.r=f.r;
		cy.r=f.r;
		System.out.println("cone1");
		c.calcArea(c.r);
		c.calcVolume(c.r);
		c.dispArea(c.a);
		c.dispVolume(c.v); 
		System.out.println("sphere1");
		s.calcArea(s.r);
		s.calcVolume(s.r);
		s.dispArea(s.a);
		s.dispVolume(s.v);
		System.out.println("cylinder1");
		cy.calcArea(cy.r);
		cy.calcVolume(cy.r);
		cy.dispArea(cy.a);
		cy.dispVolume(cy.v);
	}
}
