package exEstruturaFor;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat = 1;
						
		for (int i=n; i>1; i--) {
			fat *= i;
		}
		
		if (fat > 0 || fat < 0) {
			System.out.println(fat);
		}else {
			System.out.println("1");
		}
	}
}

/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
*/