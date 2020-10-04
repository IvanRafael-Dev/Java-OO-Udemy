package secao09ExercicioFixacao.entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account (int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account (int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //balance += initialDeposit; // caso a regra de deposito mude,
								 // o construtor será atualizado automaticamente com o novo método deposito;
	}
		
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw + 5.0;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}	
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
