package Calculators;

import java.util.Scanner;

public class Dodecahedron {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double edge;
		System.out.print("Enter an edge:");
		edge = sc.nextDouble();
		int first = 15+7;
		double second = Math.sqrt(5)*first;
		double third = second/4;
		double volume = third*(edge*edge*edge);
		System.out.println("The volume is: "+ volume);
		

	}

}
