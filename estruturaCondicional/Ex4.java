package estruturaCondicional;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int duracao;
		
		if (horaInicio < horaFim) {
			duracao = horaFim - horaInicio;
		}else {
			duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.println("O jogo durou "+duracao+" hora(s)");
		
		sc.close();
	}

}
/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/