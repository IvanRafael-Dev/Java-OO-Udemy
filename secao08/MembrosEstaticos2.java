package secao08;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembrosEstaticos2 {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator(); //instanciado pois os metodos da classe nao sao static
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circunferencia = calc.circunference(radius);
		
		double volume = calc.volume(radius);
		
		System.out.printf("Circunference: %.2f\n", circunferencia);
		System.out.printf("Volume: %.2f\n", volume);
		System.out.printf("PI value: %.2f\n", calc.PI);
		
		sc.close();
	}		
}

