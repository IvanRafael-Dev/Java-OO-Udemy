package secao08.entities;


public class CurrencyConverter {
		
	public static double IOF = 0.06;
		
	public static double conversao(double qtd, double preco) {
		return qtd * preco * (1.0 + IOF);
	}

}
		

