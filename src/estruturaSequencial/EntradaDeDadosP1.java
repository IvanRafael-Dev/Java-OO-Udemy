package estruturaSequencial;
import java.util.Scanner;
public class EntradaDeDadosP1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//para String
	/*	String x;
	//	System.out.println("Digite uma String");
		x = scan.next();
		System.out.println("Voce digitou "+ x);
		
		//para int
		int i;
	//	System.out.println("Digite um Int");
		i = scan.nextInt();
		System.out.println("Voce digitou "+ i);
		
		
		//para double
		double d;
	//	System.out.println("Digite um Double:");
		d = scan.nextDouble();
		System.out.println("Voce digitou " + d);

		//para char	
		char c;
    //  System.out.println("Digite um Char:");
		c = scan.next().charAt(0);
		System.out.println("Voce digitou " + c);  */
		
		System.out.println("Podemos ler varias variaveis separadas por virgula, digite um nome, int, double e char"
				+ " separados por um espaco:");
		
		String nome2 = scan.next();
		int inteiro = scan.nextInt();
		double real = scan.nextDouble();
		char letra = scan.next().charAt(0);
		scan.close();
		System.out.println(nome2 +" "+ inteiro +" "+ real +" " +letra);
	}

}
