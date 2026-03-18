import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Complex
{
	double real;
	double imag;


	static Complex multiply(Complex c1,Complex c2)
	{
		Complex result = new Complex();
		result.real = c1.real*c2.real - c1.imag*c2.imag;
		result.imag = c1.real*c2.imag + c2.real*c1.imag;
		return result;
	}
	void DisplayComplex(Complex result)
	{
		System.out.println(result.real);
		System.out.println(result.imag);
	}
}

public class test {
public static void main(String[] args) {
	Complex c1 = new Complex();
	Complex c2 = new Complex();
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the real and imaginary part of first complex number");
	c1.real = sc.nextDouble();
	c1.imag = sc.nextDouble();
	System.out.println("Please enter the real and imaginary part of second complex number");
	c2.real = sc.nextDouble();
	c2.imag = sc.nextDouble();
	Complex result = Complex.multiply(c1,c2);
	result.DisplayComplex(result);
}
}
