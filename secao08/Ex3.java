package secao08;

import java.util.Locale;
import java.util.Scanner;

import secao08.entities.Student;

public class Ex3 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student um = new Student();
		Student dois = new Student();
		
		System.out.println("Estudante 1:");
		System.out.println("Nome: ");
		um.nome = sc.nextLine();
		System.out.println("Nota 1: ");
		um.notaUM = sc.nextDouble();
		System.out.println("Nota 2: ");
		um.notaDois = sc.nextDouble();
		System.out.println("Nota 3; ");
		um.notaTres = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Estudante 2:");
		System.out.println("Nome: ");
		dois.nome = sc.nextLine();
		System.out.println("Nota 1: ");
		dois.notaUM = sc.nextDouble();
		System.out.println("Nota 2: ");
		dois.notaDois = sc.nextDouble();
		System.out.println("Nota 3; ");
		dois.notaTres = sc.nextDouble();
		
		System.out.println("Final grade: "+um.finalGrade());
		um.situacao();
		System.out.println();
		System.out.println("Final grade: "+dois.finalGrade());
		dois.situacao();
	}

}
