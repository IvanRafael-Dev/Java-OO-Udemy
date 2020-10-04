package secao08;

import java.util.Locale;
import java.util.Scanner;

import secao08.entities.Employee;

public class Ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);				
		Employee um = new Employee();
		
		System.out.print("Name: ");
		um.name = sc.nextLine();
		System.out.print("Gross salary: ");
		um.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		um.tax = sc.nextDouble();

		System.out.println();
		System.out.printf("Employee: "+um);
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		um.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: "+um);
		
		sc.close();

	}

}
