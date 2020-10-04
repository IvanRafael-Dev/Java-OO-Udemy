package estruturaCondicional;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x , y;
		System.out.println("Insira o valor de x: ");
		x = sc.nextDouble();
		System.out.println("Insira o valor de y: ");
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}else {
			System.out.println("Origem");
		}


	}

}
/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.

		    y
		   |
	  Q2   |  Q1
	_______|______ x
		   |
	  Q3   |  Q4
		   | 
*/