package secao08;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator3;

public class MembrosEstaticos3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circunferencia = Calculator3.circunference(radius);
		
		double volume = Calculator3.volume(radius);
		
		System.out.printf("Circunference: %.2f\n", circunferencia);
		System.out.printf("Volume: %.2f\n", volume);
		System.out.printf("PI value: %.2f\n", Calculator3.PI);		
		
		sc.close();
	}
}


