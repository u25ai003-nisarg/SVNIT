import java.util.Scanner;
class calc1
{
	double w;
	double height;
	double calculate()
	{
		return (w/(height*height));
	}
}
public class BMI{
	public static void main(String[] args) {
		calc1 c = new calc1();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the height in inches");
		c.height = sc.nextDouble()*0.0254;
		System.out.println("please enter the weight in pounds");
		c.w= sc.nextDouble()*0.45359237;
		
		System.out.println("The BMI is");
		System.out.println(c.calculate());
	}
}
