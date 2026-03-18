

abstract class Car {

    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    abstract void avg();
    abstract void mode();

    void drive() {
        System.out.println("You are driving the car....");
    }
}

class Maruti extends Car {

    Maruti() {
        super("Maurti Suzuki");
    }

    @Override
    void avg() {
        System.out.println("Average of Maruti is 22 kmpl.");
    }

    @Override
    void mode() {
        System.out.println("Maruti has normal mode.\n\n");
    }
}

class Santro extends Car {

    Santro() {
        super("Hyundai Santro");
    }

    @Override
    void avg() {
        System.out.println("Average of Santro is 17 kmpl.");
    }

    @Override
    void mode() {
        System.out.println("Santro has normal & eco mode.\n\n");
    }
}

public class OOP34 {
    static void main(String[] args) {

        Maruti c1 = new Maruti();
        Santro c2 = new Santro();

        c1.drive();
        System.out.println(c1.brand);
        c1.avg();
        c1.mode();

        c2.drive();
        System.out.println(c2.brand);
        c2.avg();
        c2.mode();
    }
}