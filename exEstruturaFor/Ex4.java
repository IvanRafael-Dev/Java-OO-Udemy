package exEstruturaFor;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		double num1, num2;
		
		for (int i=0; i<n; i++) {
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			if(num2 != 0) {
				System.out.println(num1/num2);
			}else {
				System.out.println("Divisao impossível");
			}
		}

	}

}
 /*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/