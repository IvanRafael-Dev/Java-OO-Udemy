package estruturaCondicional;

import java.util.Scanner;

public class AtribuicaoCumulativa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a qtd de minutos: ");
		int minutos = sc.nextInt();
		int minExtra = 2;
		
		double total = 50;
		
		if(minutos<=100) {
			System.out.println("Valor total = R$"+total);
		}else if (minutos>100) {
			total += (minutos - 100) * minExtra;
			System.out.println("Valor total = R$"+total);
		}
		

	}

}
