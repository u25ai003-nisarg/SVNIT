class Product {

    String productID;
    String name;
    String categoryID;
    double unitPrice;

    Product(String productID, String name, String categoryID, double unitPrice) {

        this.productID = productID;
        this.name = name;
        this.categoryID = categoryID;
        this.unitPrice = unitPrice;
    }
}

class ElectricalProduct extends Product {

    double voltageRange;
    double wattage;

    ElectricalProduct(String productID, String name, String categoryID, double unitPrice, double voltageRange, double wattage) {

        super(productID, name, categoryID, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    void modifyWattageAndPrice (double wattage, double unitPrice) {

        this.wattage = wattage;
        this.unitPrice = unitPrice;

    }

    void displayDetails() {

        System.out.println("Product ID : " + productID + ", name : " + name + ", Category ID : " + categoryID + ", Unit Price : " + unitPrice + ", Voltage Range : " + voltageRange + ", Wattage : " + wattage);

    }

}

public class OOP26 {

    static void main(String[] args) {
        ElectricalProduct ep1 = new ElectricalProduct("ac4272c", "Washing Machine", "washmac426", 50000, 4000, 300);

        ep1.displayDetails();

        ep1.modifyWattageAndPrice( 350, 40000);

        ep1.displayDetails();
    }

}
