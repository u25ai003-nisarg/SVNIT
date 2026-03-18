class Teacher {
    String name;
    int age;
    String dateOfBirth;
    String bornCity;

    Teacher(String name, int age, String dateOfBirth, String bornCity) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.bornCity = bornCity;
    }

    void printDetails() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.dateOfBirth);
        System.out.println(this.bornCity);
    }

}

class Student1 extends Teacher {

    String rollNo;

    Student1(String name, int age, String dateOfBirth, String bornCity, String rollNo) {
        super(name, age, dateOfBirth, bornCity);
        this.rollNo = rollNo;
    }

    void printStudent1Details() {
        printDetails();
        System.out.println(this.rollNo);
    }
}

public class OOP40 {
    static void main(String[] args) {
        Teacher t1 = new Teacher("Praveen Kumar Chandaliya", 40, "01/01/1985", "Jaipur");
        Student1 s1 = new Student1("Dev", 18, "30/08/2007", "Vadodara", "U25AI009");
        t1.printDetails();
        s1.printStudent1Details();
    }
}