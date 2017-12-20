package Calculators;
import java.util.Scanner;
public class TriangleArea {

	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
	
		
		double base;
		double height;
		System.out.print("Enter the Triangles Base:");
		base = sc.nextDouble();
		System.out.print("Enter the Triangles Height:");
		height = sc.nextDouble();
		double preArea = base*height;
		double Area = preArea / 2;
		System.out.println("The area is: " + Area);
				
}
	
}
