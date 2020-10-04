import java.util.Scanner;

class MaiorNum {
	int maiorNumero(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		}else if (b>c) {
			return b;
		}else {
			return c;
		}
		
		
	}
}

	

public class FuncoesSintaxe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		MaiorNum m = new MaiorNum();
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int maiorNum = m.maiorNumero(num, num2, num3);
		
		showResult(maiorNum);
		
		
	
		sc.close();
	}
	
	public static void showResult(int maiorN) {
		System.out.println("O Maior numero é: "+maiorN);
	}


}
/* Funcoes:
	Representam um processamento que possui um significado:
		Math.sqrt(double)
		System.out.println(string)

	Principais vantagens:
		Modularizacao (divide, organiza o codigo) delegação e reaproveitamento.

	Dados de entrada e saida:
		funcoes podem receber dados de entrada (parametros ou argumentos)
		funcoes podem ou nao retornar uma saida

	Em orientacao a objetos, funcoes em classes recebem o nome de métodos;
*/