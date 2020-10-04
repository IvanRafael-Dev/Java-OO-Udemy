import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println("Bom dia quebrando linha");
		System.out.print("Estudando Java, ");
		System.out.print("sem quebra de linha\n");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("X = %.2f\n", x);
		System.out.println("Utilizando Locale.setDefault(Locale.US) para pontuacao US");
		Locale.setDefault(Locale.US); // localizacao do programa
		System.out.printf("%.4f\n", x);
		System.out.println("Concatenando com println");
		System.out.println("O resultado é "+x+" metros");
		System.out.printf("Concatenando com printf\n");
		System.out.printf("O resultado é %.2f metros\n", x);
		
		String nome = "Patricia"; // no printf %s (String)
		int idade = 32;           // no printf %d (inteiros)
		double renda = 8000.0;    // no printf %f (ponto flutuante)
								  // no printf %n (quebra de linha)
		
		System.out.printf("%s tem %d anos e possui uma renda de %.2f reais%n", nome, idade, renda);
		
		
	}

}
