package Calculators;
import java.util.Scanner;
public class Perimiter {

	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){

		double Length;
		double Height;
		System.out.print("Enter the Paralellograms Length:");
		Length = sc.nextDouble();
		System.out.print("Enter the Paralellograms Height:");
		Height = sc.nextDouble();
		double TotalLength = Length+Length;
		double TotalHeight = Height+Height;
		double Perimiter = TotalLength + TotalHeight;
		System.out.print("The Paralellograms Perimiter is:" + Perimiter);
	}
	}