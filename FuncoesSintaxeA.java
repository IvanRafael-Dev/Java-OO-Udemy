import java.util.Scanner;

public class FuncoesSintaxeA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();		
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
	
	//funcao
	
	public static int max(int x, int y, int z) {//public (funcao disponivel de outras classes) static (para que essa 
												//funcao possa ser chamada independente de se criar um objeto
		int aux; // variavel local (quando a funcao acaba as variaveis sao desalocadas da memoria
		
		if(x>y && x>z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int maior) { //void (nao retorna um valor para ser alocado numa variavel
		System.out.println("O maior número é: "+maior);
	}
}
