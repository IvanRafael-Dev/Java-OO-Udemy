package orientadoObjetos;

import java.util.Locale;
import java.util.Scanner;

import orientadoObjetos.entities.TriangleA;

public class ProblemaComOO {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TriangleA x = new TriangleA(); // instanciado
		TriangleA y = new TriangleA();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a =sc.nextDouble();
		y.b =sc.nextDouble();
		y.c =sc.nextDouble();
		
		double areaX = x.area();	
		double areaY = y.area();
		
		imprime(areaX, areaY);
	}
	


	public static void imprime(double areaX, double areaY) {
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else if(areaX == areaY) {
			System.out.println("X & Y have the same area");
		}else {
			System.out.println("Larger area: Y");
		}
	}
	
}

