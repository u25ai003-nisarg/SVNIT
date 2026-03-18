import java.util.Scanner;
class Ptrn {

    int x;
    int y;

    Ptrn(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void Ptrn(int z) {

        String str = String.valueOf(z);
        int count = 0;

        for(int i = x; i <= y;  i++) {
            String str1 = String.valueOf(i);

            if(str1.contains(str)) {
                System.out.println(i);
                count++;
            }

        }

        System.out.println("Total numbers containing the Pattern are : " + count);

    }

}


public class OOP22 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Please enter the lower range");
    	int range1 = s.nextInt();
    	System.out.println("Please enter the higher range");
    	int range2 = s.nextInt(); 
    	System.out.println("Please enter the Pattern");
        int p = s.nextInt();
    	Ptrn p1 = new Ptrn(range1,range2);

        p1.Ptrn(p);
    }
}