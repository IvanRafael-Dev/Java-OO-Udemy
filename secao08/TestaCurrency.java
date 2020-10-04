package secao08;

import java.util.Locale;
import java.util.Scanner;

import secao08.entities.CurrencyConverter;

public class TestaCurrency {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price ");
		double dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double qtdUS = sc.nextDouble();
		double total = CurrencyConverter.conversao(qtdUS, dolar);
		System.out.printf("Amount to be paid in reais %.2f", total);
		
	}
	
	/*
	public static double currency(double dolar, double qtd) {
		double subTotal = dolar * qtd;
		double iof = subTotal * 6 / 100;		
		return subTotal + iof;
	} */
}
