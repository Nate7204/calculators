package Calculators;

import java.util.Scanner;

public class EllipseArea {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {


		
		double a;
		System.out.print("Enter the a:");
		a = sc.nextDouble();
		double b;
		System.out.print("Enter the b:");
		b = sc.nextDouble();
		double pre = a*b*3.14159;
		System.out.println("The area is:" + pre);
	}

}

