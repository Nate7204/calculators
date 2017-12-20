package Calculators;
import java.util.Scanner;

public class PerimiterofSquare {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		double side;
		System.out.print("Enter one of the Side lengths: ");
		side = sc.nextDouble();
		
		double perim= side*4;
		
		System.out.println("The Final Perimiter is: " + perim);
	}

}
