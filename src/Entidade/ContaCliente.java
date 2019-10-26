package Entidade;

public class ContaCliente {
	
	private String nome;
	private int numeroConta;
	private double saldo;
	
	public ContaCliente(String nome, int numeroConta) {
		super();
		this.nome = nome;
		this.numeroConta = numeroConta;
	}
	
	public ContaCliente(String nome, int numeroConta, double depositoInicial) {
		super();
		this.nome = nome;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void saque(double quantidade) {
		this.saldo -= quantidade + 5.00;
	}
	
	@Override
	public String toString() {
		return "Extrato Conta: "
				+ ", Nome Cliente: " + nome + ", Conta:"
				+ numeroConta + ", Saldo:" 
				+ String.format(" %.2f", saldo) ;
	}
}
