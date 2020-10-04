package exEstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double nota = 0, media;
		
		for(int i=0; i<n; i++) {
			nota += sc.nextDouble()*2;
			nota += sc.nextDouble()*3;
			nota += sc.nextDouble()*5;
			media = nota/10;
			System.out.printf("%.1f\n",media);
			nota = 0;					
		}
		sc.close();
		
		System.out.println("fim");

	}

}

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/