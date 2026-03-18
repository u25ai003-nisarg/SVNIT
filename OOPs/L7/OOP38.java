class Vehicle {
    String model;
    String color;
    int price;

    Vehicle(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void maxSpeed() {

    }
}

class Car1 extends Vehicle {

    Car1(String model, String color, int price) {
        super(model, color, price);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Details :-");
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println("The max speed of Car1 is 180 kmph.\n\n");
    }

}

class Bicycle extends Vehicle {

    Bicycle(String model, String color, int price) {
        super(model, color, price);
    }
    @Override
    public void maxSpeed() {
        System.out.println("Details :-");
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println("The max speed of Bicycle is 120 kmph.\n\n");
    }

}

class Scooter extends Car1 {

    Scooter(String model, String color, int price) {
        super(model, color, price);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Details :-");
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println("The max speed of Scooter is 100 kmph.\n\n");
    }

}

public class OOP38 {
    static void main(String[] args) {
        Car1 c = new Car1("BMW","Black",15000000);
        Bicycle b = new Bicycle("TVS", "Yellow", 200000);
        Scooter s = new Scooter("Honda", "White", 100000);

        c.maxSpeed();
        b.maxSpeed();
        s.maxSpeed();
    }
}