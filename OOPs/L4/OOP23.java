
interface function
{
	int evaluate (int a);
}

class Half implements function
{
	@Override
	public int evaluate(int a)
	{
		return a/2;
	}
}
public class OOP23 {
	public static void main(String[] args) {
		Half h = new Half();
		int[] a = {1,2,3,4,5,6,7,8,9,10};
	
		for(int i = 0;i<10;i++)
		{
			a[i] = h.evaluate(a[i]);
		}
		for(int i = 0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}

}
