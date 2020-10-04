package estruturaSequencial;

import java.util.Scanner;

public class EntradaDeDadosP2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s1, s2, s3;
		int x = scan.nextInt();
		
		scan.nextLine(); // usado para absorver a quebra de linha deixada em aberto pelo nextInt()
		
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
