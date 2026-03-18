
class Fruit {
    String name;
    String bunchOrSingle;
    double price;

    Fruit(String name,String bunchOrSingle,double price) {
        this.name = name;
        this.bunchOrSingle = bunchOrSingle;
        this.price = price;
    }

    void display() {
        System.out.println("NAME : " + name + ", Bunch/Single : " + bunchOrSingle + ", price : " + price + "\n\n");
    }
}

public class OOP27 {
    static void main(String[] args) {
        Fruit f1 = new Fruit("Grapes", "Bunch", 10);
        Fruit f2 = new Fruit("Apple","Single", 2);

        f1.display();
        f2.display();
    }
}