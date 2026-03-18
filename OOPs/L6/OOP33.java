import java.util.Scanner;

class WashingMachine {

    int noOfClothes;
    Scanner sc = new Scanner(System.in);

    void switchOn(){
        System.out.println("Washing Machine is now switched ON !\n");
    }
    int acceptClothes() {
        System.out.print("Enter the Total Number of Clothes : ");
        this.noOfClothes = sc.nextInt();

        return noOfClothes;
    }
    void acceptDetergent() {
        System.out.println("\nAdd Detergent in the Washing Machine !\n");
    }
    void switchOff(){
        System.out.println("Washing Machine is now switched OFF !\n");
    }
}

public class OOP33 {
    static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.switchOn();
        System.out.println(wm.acceptClothes());
        wm.acceptDetergent();
        wm.switchOff();
    }
}