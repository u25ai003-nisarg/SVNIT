import java.util.Scanner;
class velocity
{
	double initial;
	double last;
	double time;
	double calculate()
	{
		return ((last - initial)/time);
	}
}
public class acceleration {
	public static void main(String[] args) {
		velocity v = new velocity();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the initial velocity");
		v.initial = sc.nextDouble();
		System.out.println("please enter the final velocity");
		v.last = sc.nextDouble();
		System.out.println("please enter the time taken");
		v.time = sc.nextDouble();
		System.out.println("The acceleration is");
		System.out.println(v.calculate());
	}
}
