import java.util.Scanner;
class calc
{
	double velocity;
	double acceleration;
	double calculate()
	{
		return (velocity*velocity)/(2*acceleration);
	}
}
public class runway {
	public static void main(String[] args) {
		calc c = new calc();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the velocity");
		c.velocity = sc.nextDouble();
		System.out.println("please enter the accelaration");
		c.acceleration= sc.nextDouble();
		System.out.println("The runway length is");
		System.out.println(c.calculate());
	}
}
