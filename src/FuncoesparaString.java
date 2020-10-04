
public class FuncoesparaString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc",  "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("String original = "+original);
		System.out.println("toLowerCase() = -"+s01+"-");
		System.out.println("toUpperCase() = -"+s02+"-");
		System.out.println("trim() = -"+s03+"-");
		System.out.println("substring(2) = -"+s04+"-");
		System.out.println("substring(2, 9) = -"+s05+"-");
		System.out.println("replace('a', 'x') = -"+s06+"-");
		System.out.println("replace(\"abc\", \"x\") = -"+s07+"-");	
		System.out.println("indexOf(\"bc\") = "+i);
		System.out.println("lastIndexOf(\"bc\") = "+j);
		
		String s = "potato apple lemon";
		s.trim();
		String[] vetorS = s.split("");
		String letra = "l";
		int contagem = 0;
		
		for (int k=0; k<vetorS.length; k++) {
			if(vetorS[k].equalsIgnoreCase(letra)) {
				contagem++;
			}
		}
		
		
		for (String a : vetorS) {
			System.out.println(a);
		}
		
		System.out.println(contagem);
				
	}
}

/*
formatar:
	toLowerCase(), toUpperCase(), trim() // trim = remover espaços
recortar:
	substring(inicio), substring(inicio, fim)
substituir: 
	Replace(char, char), Replace(string, string)
buscar:
	IndexOf, LastIndexOf 
	
str.Split(" "); // recortar String com base no valor entre parenteses

*/