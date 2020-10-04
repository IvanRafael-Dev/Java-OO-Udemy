package secao09Construtores;

import java.util.Locale;
import java.util.Scanner;

import secao09Construtores.entities.Produto;

public class TestaProduto {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Produto teste = new Produto(); // contrutor padrao
			
						
			System.out.println("Enter product data: ");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");		
			double price = sc.nextDouble();					
			System.out.print("Quantity in stock: ");
			//int quantity = sc.nextInt();
			
			Produto product = new Produto(name, price); //evita que algo volte 0 ou null;
							// instanciacao com entrada obrigatoria de dados
			
			System.out.println();
			System.out.println("Product data: "+product);
			product.imprime();
			
			System.out.print("\nEnter the number of products to be added in stock: ");
			product.addProducts(sc.nextInt());
			
			
			System.out.println("Updated data: ");
			product.imprime();
			
			
			System.out.print("\nEnter the number of products to be removed in stock: ");
			product.removeProducts(sc.nextInt());
			
			
			System.out.println("Updated data: ");
			product.imprime(); //impressao com método imprimir
			
			/*
			System.out.println(product); // impressao com toString()
			System.out.println(product2);
			*/
		
				
			sc.close();

		}

	}