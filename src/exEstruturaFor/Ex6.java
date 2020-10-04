package exEstruturaFor;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean primo = true;
		
		for (int i=2; i<num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				primo = false;
			}
		}
		System.out.println(num);
		if (primo) {
			System.out.println("Primo");
		}
	}

}
/*
Ler um número inteiro N e calcular todos os seus divisores.
*/