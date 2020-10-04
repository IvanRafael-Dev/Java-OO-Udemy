package secao09ExercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

import secao09ExercicioFixacao.entities.Account;

public class Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account contaIvan;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
			
		System.out.print("Is there an initial deposit? (y/n): ");
		char response = sc.next().charAt(0);
		
		if( response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			contaIvan = new Account(number, holder, initialDeposit);
		}else {
			contaIvan = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(contaIvan);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		contaIvan.deposit(depositValue);
		System.out.println("Updated Account data: ");
		System.out.println(contaIvan);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		contaIvan.withdraw(withdrawValue);
		System.out.println("Updated Account data: ");
		System.out.println(contaIvan);
		
		sc.close();

	}

}
