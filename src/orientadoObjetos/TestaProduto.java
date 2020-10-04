package orientadoObjetos;

import java.util.Locale;
import java.util.Scanner;

import orientadoObjetos.entities.Produto;

public class TestaProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto product = new Produto();
		Produto product2 = new Produto();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		//product2.name = sc.nextLine();
		
		System.out.print("Price: ");		
		product.price = sc.nextDouble();
		//product2.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		//product2.quantity = sc.nextInt();		
		
		System.out.println("Product data: ");
		product.imprime();
		//product2.imprime();
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		//product2.addProducts(sc.nextInt());
		
		System.out.println("Updated data: ");
		product.imprime();
		//product2.imprime();
		
		System.out.print("\nEnter the number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());
		//product2.removeProducts(sc.nextInt());
		
		System.out.println("Updated data: ");
		product.imprime(); //impressao com método imprimir
		//product2.imprime();
		
		/*
		System.out.println(product); // impressao com toString()
		System.out.println(product2);
		*/
	
			
		sc.close();

	}

}
