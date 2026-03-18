import java.util.Scanner;

class rectangle
{
	int height;
	int width;
	int x;
	int y;
}
public class geometry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rectangle r1 = new rectangle();
		rectangle r2 = new rectangle();
		System.out.println("Please enter the height of rectangle 1");
		r1.height = sc.nextInt();
		System.out.println("Please enter the width of rectangle 1");
		r1.width= sc.nextInt();
		System.out.println("Please enter the X of rectangle 1");
		r1.x= sc.nextInt();
		System.out.println("Please enter the Y of rectangle 1");
		r1.y = sc.nextInt();
		System.out.println("Please enter the height of rectangle 2");
		r2.height = sc.nextInt();
		System.out.println("Please enter the width of rectangle 2");
		r2.width= sc.nextInt();
		System.out.println("Please enter the X of rectangle 2");
		r2.x= sc.nextInt();
		System.out.println("Please enter the Y of rectangle 2");
		r2.y = sc.nextInt();
		int check = (r1.x-r2.x)*(r1.x-r2.x)-(r1.y-r2.y)*(r1.y-r2.y);
		check = (int)Math.sqrt(check);
		if(r1.x > r2.x) {

            if( ( (r1.x - r2.x) <= ( (r1.width/2) - (r2.width/2) ) ) && ( (r1.y - r2.y) <= ( (r1.height/2) - (r2.height/2) ) ) ) {
                System.out.println("\n\nr2 is inside r1");
            }
            else if( ( (r1.x - r2.x) <= ( (r1.width/2) - (r2.width/2) ) ) || ( (r1.y - r2.y) <= ( (r1.height/2) - (r2.height/2) ) ) ) {
                System.out.println("\n\nr2 overlaps r1");
            }
            else {
                System.out.println("\n\nr2 does not overlap r1");
            }

        }
        else {

            if( ( (r2.x - r1.x) <= ( (r1.width/2) - (r2.width/2) ) ) && ( (r2.y - r1.y) <= ( (r1.height/2) - (r2.height/2) ) ) ) {
                System.out.println("\n\nr2 is inside r1");
            }
            else if( ( (r2.x - r1.x) <= ( (r1.width/2) - (r2.width/2) ) ) || ( (r2.y - r1.y) <= ( (r1.height/2) - (r2.height/2) ) ) ) {
                System.out.println("\n\nr2 overlaps r1");
            }
            else {
                System.out.println("\n\nr2 does not overlap r1");
            }

        }
	}
}
