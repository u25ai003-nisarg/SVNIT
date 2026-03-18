import java.util.Scanner;
class Energy
{
	double initial;
	double last;
	double amount;
	double calculate()
	{
		return ((last - initial)*amount*4184);
	}
}
public class calcEnergy {
	public static void main(String[] args) {
		Energy e = new Energy();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the initial temperature");
		e.initial = sc.nextDouble();
		System.out.println("please enter the final temperature");
		e.last = sc.nextDouble();
		System.out.println("please enter the amount of water");
		e.amount= sc.nextDouble();
		System.out.println("The Energy is");
		System.out.println(e.calculate());
	}
}
