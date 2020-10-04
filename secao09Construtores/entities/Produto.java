package secao09Construtores.entities;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	public Produto(){ // construtor padrao da classe
		
	}
	
	public Produto (String name, double price, int quantity) { 
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/*sobrecarga*/
	public Produto (String name, double price) {  // agora podemos usar 2 argumentos
		this.name = name;
		this.price = price;
		//this.quantity = quantity; irá receber o valor default de 0
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // implementar a minha versao (sobreposicao) do toString(que eh uma metodo Object)
		return name
			+", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+" units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
	
	public void imprime() {
		System.out.printf("%s, $ %.2f, %d units, Total: $ %.2f\n", name, price, quantity, totalValueInStock());
	}
}
