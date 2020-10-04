package orientadoObjetos.entities;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double triangulo(double x, double y, double z) {
		double p = (x + y + z)/2;
		double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
		return area;
	}
	
	public void info(double areaX, double areaY) {
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
	
		class Triangulo {
		public void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Triangle x = new Triangle();
			Triangle y = new Triangle();
			
			System.out.println("ladosX: a,b,c");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
						
			double areaX = x.triangulo(x.a, x.b, x.c);
			
			System.out.println("ladosY: a,b,c");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areaY = y.triangulo(y.a, y.b, y.c);
			
			info(areaX, areaY);

			
			sc.close();
			
			
		}
	}
	
}