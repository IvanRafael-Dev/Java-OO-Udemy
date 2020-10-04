package exEstruturaWhile;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x,y;
		
		
			System.out.println("Valor de x: ");
			x = scan.nextInt();
			System.out.println("Valor de y: ");
			y = scan.nextInt();
			
			while (x != 0 && y!=0) { //enquanto ambas forem diferentes de 0, se x ou y = 0 sai do loop;
				if(x > 0 && y > 0) {
					System.out.println("Q1");
				}else if(x < 0 && y > 0) {
					System.out.println("Q2");
				}else if(x < 0 && y < 0) {
					System.out.println("Q3");
				}else if(x > 0 && y < 0) {
					System.out.println("Q4");
				}
				
				System.out.println(" ");
				
				System.out.println("Valor de x: ");
				x = scan.nextInt();
				System.out.println("Valor de y: ");
				y = scan.nextInt();
			}
		
		
		

	}

}
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/