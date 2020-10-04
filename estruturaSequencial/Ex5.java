package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
		double valorPeca1, valorPeca2; 
		double totalP1, totalP2, total;
		
		codPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		totalP1 = qtdPeca1 * valorPeca1;
		totalP2 = qtdPeca2 * valorPeca2;
		
		total = totalP1+totalP2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);

	}

}
/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/