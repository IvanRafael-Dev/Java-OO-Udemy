package estruturaSequencial;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, y, soma;
		
		x = scan.nextInt();
		y = scan.nextInt(); 
		soma = x+y;
		
		System.out.println("Soma de "+x+" + "+y+ " = "+ soma);
		
		

	}

}
