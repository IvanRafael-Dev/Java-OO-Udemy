package estruturaSequencial;

public class FuncoesMatematicasDoJava {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); // raiz quadrada de x
		B = Math.sqrt(y); // raiz quadrada de y
		C = Math.sqrt(25.0); // raiz quadrada de 25		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y); // x elevado a y
		B = Math.pow(x, 2.0); // x elevado a 2 (quadrado)
		C = Math.pow(5.0, 2.0); // 5 elevado ao quadrado
		System.out.println(x + " elevado a "+ y +" = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		/* incluindo expressoes maiores
		 * 
		 * formula baskara:
		 * 
		 * delta = Math.pow(b,2) - 4*a*c;
		 * x' = (-b + Math.sqrt(delta))/(2*a);
		 * x" = (-b - Math.sqrt(delta))/(2*a);
		 */
	}	
}
