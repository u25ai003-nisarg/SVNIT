package OOPs.L2;
class Employee
{
    String name;
    String lname;
    double salary;
    Employee(String name,String lname,double salary)
    {
        this.name=name;
        this.lname=lname;
        this.salary=salary;
    }
}

public class OOP9 {
    public static void main(String[] args) {
        Employee E1 = new Employee("nisarg ","desai",150000);
        System.out.print(E1.name);
        System.out.println(E1.lname);
        System.out.println(E1.salary);
    }
}
