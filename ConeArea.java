package Calculators;

import java.util.Scanner;

public class ConeArea {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {


		
		double radius;
		System.out.print("Enter the radius:");
		radius = sc.nextDouble();
		double height;
		System.out.print("Enter the height:");
		height = sc.nextDouble();
		double RadiusSQ = radius*radius;
		double area = RadiusSQ*3.14159;
				double VOLUME = area*height;
				System.out.println("The volume is: " + VOLUME);
	}

}
