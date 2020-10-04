package secao09ExercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

import secao09ExercicioFixacao.entities.Conta;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta contaIvan; // importante para o if else// definir foda do escopo 'if'
		
		System.out.print("Enter account number: "); 
		int numConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");		
		String nome = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n): ");
		String depInicial = sc.nextLine();
		
		
		if(depInicial.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			double depInicialValor = sc.nextDouble();
			contaIvan = new Conta (numConta, nome, depInicialValor);
		}else {
			contaIvan = new Conta (numConta, nome);
		}

		System.out.println("\nAccount data: ");
		System.out.println(contaIvan);
		
		System.out.print("\nEnter a deposit value: ");
		contaIvan.deposito(sc.nextDouble());
		System.out.println("Updated account data: ");
		contaIvan.setNomeConta("Paty");
		System.out.println(contaIvan);
		
		System.out.print("\nEnter a withdraw value: ");
		contaIvan.saque(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(contaIvan);

	}

}
