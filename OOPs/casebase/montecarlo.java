import java.util.Random;

public class montecarlo {
	public static void main(String[] args) {
		double c1=0,c2=0,c3=0,c4=0;
		for (int i = 1;i<=1000000;i++)
		{
			Random r = new Random();
			int r1 = r.nextInt(100); 
			int r2 = r.nextInt(100); 
		    if(r1<=49)
		    {
		    	c1++;
		    }
		    else if(r2<=49)
		    {
		    	c4++;
		    }
		    else if(r1+r2>=150)
		    {
		    	c2++;
		    }
		    else
		    {
		    	c3++;
		    }
		}
	    System.out.println("probability ");
	    System.out.println("area 1 =" + c1/1000000);
	    System.out.println("area 2 =" + c2/1000000);
	    System.out.println("area 3 =" + c3/1000000);
	    System.out.println("area 4 =" + c4/1000000);
	}
}
