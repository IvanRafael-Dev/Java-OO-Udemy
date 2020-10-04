package estruturaCondicional;

public class Escopo {

	public static void main(String[] args) {
		
		double price = 400.00;
		
		double discount; // inicializar a variavel aqui ou no 'else' do if para ter certeza que ela sera inicializada
		
		if (price > 200) {
			//double discount = price *0.1; // toda variavel que vc declarar dentro da estrutura so exixtem dentro dessa estrutura
										  // e sao desalocadas da memoria logo apos o fim da execucao dessa estrutura
			discount = price * 0.1;
		}else {
			discount = 0;
		}
		
		System.out.println(discount);
	}

}
