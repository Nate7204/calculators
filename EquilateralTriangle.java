package Calculators;

import java.util.Scanner;

public class EquilateralTriangle {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {


		
		double a;
		System.out.print("Enter the base (a):");
		a = sc.nextDouble();
		double frac = Math.sqrt(3)/4;
		double asq = a*a;
		double finals = frac*asq;
		System.out.println("The area is: " + finals);
	}
}
