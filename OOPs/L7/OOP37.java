import java.util.Scanner;

class TotalInterest {
    float principal;
    float simpleInterest;
    float numberOfMonths;

    TotalInterest(float principal, float simpleInterest, float numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
        this.principal = principal;
        this.simpleInterest = simpleInterest;
    }

    float calculateTotalAmount() {

        float years = (numberOfMonths/12);

        return ( (years * principal * simpleInterest)/100 + principal);

    }
}

public class OOP37 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount you want to invest : ");
        float a = sc.nextFloat();

        System.out.print("Enter rate of interest : ");
        float b = sc.nextFloat();

        System.out.print("Enter Total no. of months you want to invest for : ");
        float c = sc.nextFloat();

        TotalInterest t1 = new TotalInterest(a,b,c);

        System.out.println("\n\nTotal Interest after investing : " + t1.calculateTotalAmount());
    }
}