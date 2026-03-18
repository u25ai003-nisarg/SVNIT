

import java.util.Scanner;

class Model3D {

    Scanner sc = new Scanner(System.in);

    double x;
    double y;
    double z;

    void input() {
        System.out.print("Enter x, y, and z coordinates: ");
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
        this.z = sc.nextDouble();
    }

    void output() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}

public class OOP36 {
    static void main(String[] args) {

        Model3D m1 = new Model3D();
        m1.input();
        m1.output();

        Model3D m2 = new Model3D();
        m2.input();
        m2.output();

        double result = Math.sqrt( Math.pow( (m1.x - m2.x),2) + Math.pow( (m1.y - m2.y),2) + Math.pow( (m1.z - m2.z),2) );

        System.out.println("Distance between points m1 and m2 is : " + result);
    }
}