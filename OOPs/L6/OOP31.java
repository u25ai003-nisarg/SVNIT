
class SuperDemo
{
	int age;
	SuperDemo(int a)
	{
		age = a;
	}
}
class ThisDemo extends SuperDemo
{

	ThisDemo() {
		super(17);
		this.age = 17;
	}
	void getage(int age)
	{
		System.out.println("age = " + age);
	}
}
public class OOP31 {
	public static void main(String[] args) {
		SuperDemo s = new SuperDemo(10);
		System.out.println("by super");
		System.out.println("age = "+s.age);
		ThisDemo t = new ThisDemo();
		System.out.println("by this");
		t.getage(t.age);
	}
}
