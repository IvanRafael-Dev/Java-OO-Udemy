package secao08.entities;

public class Student {

	public String nome;
	public double notaUM;
	public double notaDois;
	public double notaTres;
	
	public double finalGrade() {
		return notaUM+notaDois+notaTres;
	}
	
	public void situacao() {
		if(finalGrade()>=60) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
			System.out.printf("Missing %.2f points", 60 - finalGrade());			
		}
	}
}
