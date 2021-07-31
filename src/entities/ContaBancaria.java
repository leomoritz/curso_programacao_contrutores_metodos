package entities;

public class ContaBancaria {

	private int numConta;
	private String nomeTitular;
	private double saldo;
	private static double taxaSaque = 5.0;

	public ContaBancaria(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public ContaBancaria(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.0;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void saques(double valor) {
		this.saldo -= valor + taxaSaque;
	}
	
	public String toString() {
		return "Account: " + this.numConta
				+ ", Holder: " + this.nomeTitular
				+ String.format(", Balance: R$%.2f", this.saldo);
	}

}
