package estruturaCondicional;

import java.util.Scanner;

public class Ex1e2Juntos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Numero negativo: "+num);
			if(num % 2 == 0) {
				System.out.println("O numero "+num+" é par");
			}else{
				System.out.println("O numero "+num+" é impar");
			}
		}else if (num > 0) {
			System.out.println("Numero positivo: "+num);
			if(num % 2 == 0) {
				System.out.println("O numero "+num+" é par");
			}else{
				System.out.println("O numero "+num+" é impar");
			}
		}else {
			System.out.println("Numero ZERO");
		}
		
		sc.close();
	}

}
/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

*/