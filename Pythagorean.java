package Calculators;

import java.util.Scanner;

public class Pythagorean {

	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){

		double a2;
		double b2;
		System.out.print("Enter the a's Length:");
		a2 = sc.nextDouble();
		System.out.print("Enter the b's Length:");
		b2 = sc.nextDouble();
		double a = a2*a2;
		double b = b2*b2;
		double ab = a + b;
		double c = Math.sqrt(ab);
		System.out.print("The Hypotenuse is:" + c);
}
}