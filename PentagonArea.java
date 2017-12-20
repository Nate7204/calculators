package Calculators;
import java.util.Scanner;

public class PentagonArea {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){

		double Side;
		System.out.print("Enter the Side Length:");
		Side = sc.nextDouble();
		//Apothem is the height of the pentagon divided by 2
		double Apothem;
		System.out.print("Enter the Apothem Length:");
		Apothem = sc.nextDouble();
		double Prearea = 5*Side*Apothem;
		double Area = Prearea/2;
		System.out.print("The area of the Pentagon is :" + Area);
	}
	}
