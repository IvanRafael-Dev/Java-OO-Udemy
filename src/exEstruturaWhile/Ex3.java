package exEstruturaWhile;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo;
		
		do {
		System.out.println("Esolha o Tipo: [1]Alcool  [2]Gasolina  [3]Diesel [4] para Total");
		
		tipo = scan.nextInt();
				
			switch (tipo) {
				case 1: alcool++;
						break;
				case 2: gasolina++;
						break;
				case 3: diesel++;
						break;
				case 4: System.out.println("\nTotal: ");
						break;			
				default:System.out.println("Codigo invalido, digite novamente.\n");
			}
			
			System.out.println("Alcool: "+alcool);
			System.out.println("Gasolina: "+gasolina);
			System.out.println("Diesel: "+diesel);
			System.out.println();
			
		}while(tipo != 4);
		System.out.println("Muito Obrigado");
		
	}

}

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.

*/