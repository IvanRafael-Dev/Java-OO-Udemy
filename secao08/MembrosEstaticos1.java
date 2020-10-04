package secao08;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos1 {
	
	public static final double PI = 3.14156; //'final' diz que o atributo PI é uma constante e nao muda mais seu valor
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circunferencia = circunference(radius);
		
		double volume = volume(radius);
		
		System.out.printf("Circunference: %.2f\n", circunferencia);
		System.out.printf("Volume: %.2f\n", volume);
		System.out.printf("PI value: %.2f\n", PI);
		
		
		
		sc.close();
	}
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
