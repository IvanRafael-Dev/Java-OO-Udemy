package orientadoObjetos.entities;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int qtd) {
		this.quantity += qtd;
	}
	
	public void removeProducts(int qtd) {
		this.quantity -= qtd;
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
