package estruturaCondicional;

import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto;
		
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}

}

/* variavel = (condicao) ? true : false
*/