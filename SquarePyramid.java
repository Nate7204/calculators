package Calculators;

import java.util.Scanner;

public class SquarePyramid {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		double sq;
		double height;
		System.out.print("Enter the base's side Length:");
		sq = sc.nextDouble();
		System.out.print("Enter the Pyramids Height:");
		height = sc.nextDouble();
		double area = sq*sq;
		double pre = area*height;
		double finals = pre/3;
		System.out.print("The Volume of the Square Pyramid is " + finals);
	}
}
