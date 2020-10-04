package exEstruturaFor;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
			
		for (int i=1; i<=x; i++) {
			
			if(i % 2 == 1) {
				System.out.println(i);				
			}
		}

	}

}
/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso */