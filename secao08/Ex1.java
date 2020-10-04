package secao08;

import java.util.Locale;
import java.util.Scanner;

import secao08.entities.Rectangle;

public class Ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle um = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		um.width = sc.nextDouble();
		um.heigth = sc.nextDouble();
		
		System.out.printf("Area = %.2f\n", um.area());
		System.out.printf("Perimetro = %.2f\n", um.perimetro());
		System.out.printf("Diagonal = %.2f\n", um.diagonal());
		
		sc.close();
	}
}
