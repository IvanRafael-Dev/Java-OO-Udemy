package secao09Encapsulamento.entities;

public class Produto {
	
	private String name;
	private double price;
	private int quantity; // so pode ser alterado quando houver uma entrada ou saida no estoque;
	
	public Produto(){ 
		
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
	
	/* nao vou criar nenhum metodo set para quantity, pq ele so pode ser alterado caso o estoque seja alterado  */
	
	public void addProducts(int quantity) { // so pode ser alterado quando houver uma estrada ou saida no estoque
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) { // so pode ser alterado quando houver uma entrada ou saida no estoque;
		this.quantity -= quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
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
