package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		
		
		System.out.println("Digite o código do item: ");
		cod = sc.nextInt();
		System.out.println("Qual a quantidade?: ");
		qtd =sc.nextInt();
		
		double total = 0;
		
		if (cod == 1) {
			total = qtd * 4.00;
		}else if (cod == 2) {
			total = qtd * 4.50;
		}else if (cod == 3) {
			total = qtd * 5.00;
		}else if (cod == 4) {
			total = qtd * 2.00;
		}else if (cod == 5) {
			total = qtd * 1.50;
		}
		
		System.out.printf("TOTAL: R$%.2f", total);
	}

}
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar

cod						especificacao 					preco
1						cachorro quente					R$ 4.00
2						x-salada						R$ 4.50
3						x-bacon							R$ 5.00
4						torrada simples					R$ 2.00
5						refrigerante 					R$ 1.50

*/