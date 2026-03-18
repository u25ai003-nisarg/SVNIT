class Book {
    int bookID;
    String Title;
    String Author;
    float price;

    Book(int bookID, String Title, String Author, float price) {
        this.bookID = bookID;
        this.Author = Author;
        this.Title = Title;
        this.price = price;
    }
}

class Period extends Book{

    String period;

    Period(int bookID, String Title, String Author, float price,String period) {
        super(bookID, Title, Author, price);
        this.period = period;
    }

    public void modifyPriceAndPeriod(float price1,String period2) {
        this.price = price1;
        this.period = period2;
    }

    public String getPeriod() {
        return period;
    }

    public void printDetails() {
        System.out.println("Book ID : " + bookID);
        System.out.println("Book Title : " + Title);
        System.out.println("Author : " + Author);
        System.out.println("Price : " + price);
        System.out.println("Period : " + period);
    }
}

public class OOP39 {
    static void main(String[] args) {
        Period p1 = new Period(30082007,"Hello Java to the World", "Dev Prajapati", 10000, "weekly");

        p1.printDetails();

        System.out.println("\n\nAfter modifying");
        p1.modifyPriceAndPeriod(1500,"monthly");

        p1.printDetails();
    }
}