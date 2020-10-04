package estruturaSequencial;

public class ProcessamentoDeDadosEmJava {

	public static void main(String[] args) {
		//ex.1
		int x,y;
		x = 5;
		y = 2*x;
		
		System.out.println(x);
		System.out.println(y);
		
		//ex.2
		double n;
		
		n = 2*x;
		
		System.out.println(n);
		//ex.3
		System.out.print("Area do trapézio = ((b+B)/2)*h = ");

		double b, B, h, area;
		b = 6.0; // indicar o tipo do numero que vc esta usando, double (0.0) float (1f)
		B = 8.0;
		h = 5.0;
		area = (b+B)/2*h;
		
		System.out.println(area);
		
		//Casting, dizendo ao compilador qual tipo de retorno querremos na expressao
		
		int num1, num2;
		double resultado;
		
		num1 = 5;
		num2 = 2;
		
		resultado = (double) num1 / num2; // aqui digo ao compilador que quero um retorno do tipo double
										  // método chamado de 'Casting'	
		System.out.println(resultado);
		
		//outro exemplo de casting
		
		double i;
		int j;
		
		i = 5.0;
		//j = i;// aqui o compilador mostra um erro onde nao é possivel converter de double para int
		//fazendo o 'casting' podemos dizer ao compilador que queremos a conversao mesmo com perda de dados
		j = (int) i;
		
		System.out.println(j);
		
		// 'CASTING' conversao explicita de tipos de dados
		
	}

}
