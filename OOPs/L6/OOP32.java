import java.util.Scanner;

class TheatreProfit {

    double profit;
    int numnberOfAttendee;
    int totalPerformance;

    TheatreProfit(int numnberOfAttendee, int totalPerformance) {
        this.numnberOfAttendee = numnberOfAttendee;
        this.totalPerformance = totalPerformance;
    }

    double totalProfit() {
        profit = (5 * numnberOfAttendee * totalPerformance) - (0.5 * numnberOfAttendee) - (20 * totalPerformance);
        return profit;
    }
}

public class OOP32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of Audience : ");
        int a = sc.nextInt();

        System.out.print("Enter total number of performances : ");
        int b = sc.nextInt();

        TheatreProfit th1 = new TheatreProfit(a,b);

        System.out.println("Total Profit of the Theatre is : $" + th1.totalProfit());

        sc.close();
    }
}