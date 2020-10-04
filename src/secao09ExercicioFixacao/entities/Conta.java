package secao09ExercicioFixacao.entities;

public class Conta {
	private int numConta;
	private String nomeConta;
	private double depositoOpcional;
	private double saldo;
	private double tax = 5.00;
	
	public Conta(){
		
	}
	
	public Conta(int numConta, String nomeConta, double depositoOpcional) {
		this.nomeConta = nomeConta;
		this.numConta = numConta;
		deposito(depositoOpcional);
	}
	
	public Conta(int numConta, String nomeConta) {
		this.nomeConta = nomeConta;
		this.numConta = numConta;
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= saque;
		saldo -= tax;
		
	}
	
	public int getNumConta(){
		return numConta;
	}
	
	public String getNomeConta() {
		return nomeConta;
	}
	
	public void setNomeConta(String nome) {
		this.nomeConta = nome;
	}
		
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Account "
				+ numConta
				+ ", Holder: "
				+ nomeConta
				+ String.format(", Balance: $ %.2f",saldo);
	}
	
	
}
