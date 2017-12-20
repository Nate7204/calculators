
package Calculators;
import java.util.Scanner;
//Calculates the area of spheres APPROX.
public class SphereCalculator {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){

		double radius;
		System.out.print("Enter the radius:");
		radius = sc.nextDouble();
		double RadiusCubed = radius*radius*radius;
		double Area = RadiusCubed*3.14159*1.33333333334;
		System.out.print("The area of the Sphere is about :" + Area);
	}
	}