
import java.util.Scanner;

class figure2
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
class cone2 extends figure2
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
class sphere2 extends figure2
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
class cylinder2 extends figure2
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
public class OOP17 {
	public static void main(String[] args)
	{
		
		figure2 f = new figure2();
		cone2 c = new cone2();
	    sphere2 s = new sphere2();
	    cylinder2 cy = new cylinder2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius");
		f.r = sc.nextDouble();
		System.out.println("Please enter the height of cone2");
		c.h = sc.nextDouble();
		System.out.println("Please enter the slant height of cone2");;
		c.s = sc.nextDouble();
		System.out.println("Please enter the height of cylinder2");
		cy.h = sc.nextDouble();
		c.r=f.r;
		s.r=f.r;
		cy.r=f.r;
		System.out.println("cone2");
		c.calcArea(c.r);
		c.calcVolume(c.r);
		c.dispArea(c.a);
		c.dispVolume(c.v); 
		System.out.println("sphere2");
		s.calcArea(s.r);
		s.calcVolume(s.r);
		s.dispArea(s.a);
		s.dispVolume(s.v);
		System.out.println("cylinder2");
		cy.calcArea(cy.r);
		cy.calcVolume(cy.r);
		cy.dispArea(cy.a);
		cy.dispVolume(cy.v);
	}
}
