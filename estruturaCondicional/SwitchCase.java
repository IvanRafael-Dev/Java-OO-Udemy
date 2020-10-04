package estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int diaSemana = sc.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Dia da Semana: Domingo");break;
		case 2: System.out.println("Dia da Semana: Segunda");break;
		case 3: System.out.println("Dia da Semana: Terca");break;
		case 4: System.out.println("Dia da Semana: Quarta");break;
		case 5: System.out.println("Dia da Semana: Quinta");break;
		case 6: System.out.println("Dia da Semana: Sexta");break;
		case 7: System.out.println("Dia da Semana: Sabado");break;
		default: System.out.println("Nao é um numero válido.");
		}
		
	}

}
